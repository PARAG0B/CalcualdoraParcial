

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JTextField pantalla;
    private double num1, num2;
    private char operador;

    public Main() {
        super("Calculadora");

        // Configuración del JFrame
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Pantalla de visualización
        pantalla = new JTextField();
        pantalla.setEditable(false);
        add(pantalla, BorderLayout.NORTH);

        // Panel para botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4));

        // Botones numéricos
        JButton boton0 = new JButton("0");
        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton boton6 = new JButton("6");
        JButton boton7 = new JButton("7");
        JButton boton8 = new JButton("8");
        JButton boton9 = new JButton("9");

        // Botones de operaciones
        JButton botonSuma = new JButton("+");
        JButton botonResta = new JButton("-");
        JButton botonMultiplicacion = new JButton("*");
        JButton botonDivision = new JButton("/");
        JButton botonIgual = new JButton("=");
        JButton botonLimpiar = new JButton("C");

        // Agregar botones al panel
        panelBotones.add(boton7);
        panelBotones.add(boton8);
        panelBotones.add(boton9);
        panelBotones.add(botonSuma);
        panelBotones.add(boton4);
        panelBotones.add(boton5);
        panelBotones.add(boton6);
        panelBotones.add(botonResta);
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);
        panelBotones.add(botonMultiplicacion);
        panelBotones.add(boton0);
        panelBotones.add(botonLimpiar);
        panelBotones.add(botonIgual);
        panelBotones.add(botonDivision);

        // Agregar panel de botones al JFrame
        add(panelBotones, BorderLayout.CENTER);

        // Manejo de eventos para botones numéricos
        ActionListener numListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                pantalla.setText(pantalla.getText() + btn.getText());
            }
        };

        boton0.addActionListener(numListener);
        boton1.addActionListener(numListener);
        boton2.addActionListener(numListener);
        boton3.addActionListener(numListener);
        boton4.addActionListener(numListener);
        boton5.addActionListener(numListener);
        boton6.addActionListener(numListener);
        boton7.addActionListener(numListener);
        boton8.addActionListener(numListener);
        boton9.addActionListener(numListener);

        // Manejo de eventos para botones de operaciones
        ActionListener operacionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                operador = btn.getText().charAt(0);
                num1 = Double.parseDouble(pantalla.getText());
                pantalla.setText("");
            }
        };

        botonSuma.addActionListener(operacionListener);
        botonResta.addActionListener(operacionListener);
        botonMultiplicacion.addActionListener(operacionListener);
        botonDivision.addActionListener(operacionListener);

        // Manejo de eventos para botón igual
        botonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(pantalla.getText());
                double resultado = 0;
                boolean error = false;
                switch (operador) {
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            error = true;
                            pantalla.setText("Error: división por cero");
                        }
                        break;
                    default:
                        pantalla.setText("Error: operador no válido");
                        error = true;
                        break;
                }
                if (!error) {
                    pantalla.setText(String.valueOf(resultado));
                }
            }
        });

        // Manejo de evento para botón limpiar
        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("");
                num1 = 0;
                num2 = 0;
                operador = ' ';
            }
        });

        // Mostrar la calculadora
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
