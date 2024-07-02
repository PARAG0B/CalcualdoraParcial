# CalcualdoraParcial
Hola, Buenos días 
Mi nombre es Yeimar Alexis Ochoa gamboa 
Grupo A. A continuación, una breve explicación sobre el funcionamiento del código de una calculadora en java. 
Estructura y Componentes
1. Configuración del JFrame:
   - La clase `Calculadora` extiende `JFrame`, que representa la ventana principal de la calculadora.
   - En el constructor se establece el título, tamaño, operación de cierre predeterminada y diseño (`BorderLayout`) para el JFrame.

2. Componentes:
   - pantalla (JTextField): Es el área de visualización donde se muestran los números y resultados. Se configura como no editable (`setEditable(false)`).
   - panelBotones (JPanel): Este panel contiene los botones de la calculadora y utiliza un `GridLayout` para organizarlos en una cuadrícula de 4x4.

3. Botones:
   - Botones numéricos (`boton0` a `boton9`): Se utilizan para ingresar números en la pantalla de la calculadora. 
   - Botones de operadores (`botonSuma`, `botonResta`, `botonMultiplicacion`, `botonDivision`): Representan operaciones aritméticas básicas (`+`, `-`, `*`, `/`).
   - Botones especiales (`botonIgual`, `botonLimpiar`):
     - `botonIgual` calcula el resultado basado en la operación y operandos actuales.
     - `botonLimpiar` borra la pantalla y restablece las variables (`num1`, `num2`, `operador`).

Manejo de Eventos

- Manejo de Eventos de Botones Numéricos: Cada botón numérico (`boton0` a `boton9`) tiene un `ActionListener` que agrega el dígito correspondiente a `pantalla` (visualización).

-Manejo de Eventos de Botones de Operadores: Cada botón de operador (`botonSuma`, `botonResta`, `botonMultiplicacion`, `botonDivision`) establece la variable `operador` y guarda el número actual mostrado en `pantalla` en `num1`.

-Manejo del Botón Igual (`botonIgual`): Al presionarlo, obtiene el segundo operando (`num2`), realiza la operación según `operador`, maneja errores de división por cero y muestra el resultado o un mensaje de error apropiado.

- Manejo del Botón Limpiar (`botonLimpiar`): Restablece la pantalla (`pantalla`) y borra todas las variables almacenadas (`num1`, `num2`, `operador`).

Ejecución de la Calculadora

- El método `main` crea una instancia de `Calculadora`, inicializando y mostrando la ventana de la calculadora.
Mejoras y Consideraciones

- Manejo de Errores: Actualmente, hay un manejo básico de errores para división por cero y operadores no reconocidos. Considera mejorar los mensajes de error o agregar más verificaciones de errores robustas.
  
- Expansión de Funcionalidades: Dependiendo de los requisitos, podrías ampliar la calculadora para manejar operaciones más avanzadas (como raíz cuadrada, potenciación) o funciones de memoria.

-Mejoras en la UI: Mejora el diseño, agrega etiquetas para mayor claridad o ajusta el tamaño de la fuente para una mejor legibilidad.
