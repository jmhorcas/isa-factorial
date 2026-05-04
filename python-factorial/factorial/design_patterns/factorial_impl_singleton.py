from factorial import Factorial

class MetaSingleton(type):
    _instances = {}

    def __call__(cls, *args, **kwargs):
        if cls not in cls._instances:
            cls._instances[cls] = super(MetaSingleton, cls).__call__(*args, **kwargs)
        return cls._instances[cls]
    
    
class FactorialImpl(Factorial, metaclass=MetaSingleton):
   
    def fact(self, n: int) -> int:
        if not isinstance(n, int):
            raise TypeError('Error: n no es un número entero.')
        if n < 0:
            raise ValueError('Error: n negativo. El número n debe ser positivo.')
        return n * self.fact(n-1) if n > 0 else 1
