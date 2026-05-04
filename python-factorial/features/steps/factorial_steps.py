from behave import use_step_matcher, given, when, then
from factorial import FactorialImpl

use_step_matcher("parse")

@given(u'la calculadora de factorial está iniciada')
def step_impl(context):
    context.factorial = FactorialImpl()

@given('el número de entrada es {numero:d}')
def step_impl(context, numero):
    context.numero_entrada = numero

@when('ejecuto la operación de factorial')
def step_impl(context):
    try:
        context.resultado = context.factorial.fact(context.numero_entrada)
        context.excepcion = False
    except Exception:
        context.excepcion = True

@then('el resultado debe ser {resultado:d}')
def step_impl(context, resultado):
    assert context.resultado == resultado, f"Esperaba {resultado} pero obtuve {context.resultado}"


@then(u'el sistema debe lanzar una excepción')
def step_impl(context):
    assert context.excepcion == True, "Se esperaba una excepción pero la operación tuvo éxito"