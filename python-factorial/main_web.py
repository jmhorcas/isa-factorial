from flask import Flask, render_template, request

from factorial import FactorialImpl

app = Flask(__name__)


# --- CONTROLADOR ---
@app.route('/factorial', methods=['GET'])
def factorial():
    return render_template('index.html')

# --- CONTROLADOR ---
@app.route('/fibonacci', methods=['GET'])
def fibonacci():
    return render_template('index.html')

@app.route('/factorial', methods=['POST'])
def calcular_factorial():
    resultado = None
    numero_usuario = None
    
    if request.method == 'POST':
        try:
            numero_usuario = int(request.form.get('numero'))
            factorial = FactorialImpl()
            resultado = factorial.fact(numero_usuario)
        except TypeError:
            resultado = "Por favor, introduce un número entero válido."
        except ValueError:
            resultado = "Por favor, introduce un número entero positivo."

    # Enviamos los datos a la VISTA
    return render_template('index.html', result=resultado, n=numero_usuario)


if __name__ == '__main__':
    app.run(debug=True)