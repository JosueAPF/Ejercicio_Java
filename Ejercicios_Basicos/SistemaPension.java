/*
Sistema de jubilación:
Crea un programa que determine si un empleado es elegible para jubilación y calcule su pensión.

La edad mínima para jubilarse es 65 años.
Se necesitan al menos 25 años de servicio para una pensión completa.
La pensión base es el 70% del último salario.
Por cada año adicional después de los 25, se añade un 1% extra, hasta un máximo del 90%.
Muestra si el empleado es elegible, y si lo es, cuál sería su pensión.

*/

import java.util.Scanner;

class Datos {
    private int JubiladoEdad;
    private int ServicioOld;
    private int UltimoSalario;
    public Scanner in;

    public Datos() {
        in = new Scanner(System.in);
    }

    public void IngresoDatos() {
        System.out.println("Ingrese la Edad del Participante a Jubilar :");
        JubiladoEdad = in.nextInt();
        System.out.println("Ingrese Anos de Servicio :");
        ServicioOld = in.nextInt();
        System.out.println("Ingrese El Ultimo Salario :");
        UltimoSalario = in.nextInt();
        in.nextLine();  // Limpiar el buffer de entrada
    }

    public int GetEdad() {
        return JubiladoEdad;
    }

    public int GetServicio() {
        return ServicioOld;
    }

    public int GetUltiSalario() {
        return UltimoSalario;
    }
}

// Subclase
class CalcularJubilacion extends Datos {
    public int EdadMinima;
    public int PensionServicio; // Mínimo 25 años
    public float PensionBase;
    public float porcentajePension;
    public boolean EsLegible;

    public CalcularJubilacion() {
        super();
        EdadMinima = 65;
        PensionServicio = 25;
    }

    public void miPension() {
        IngresoDatos();
        int EdadPensionado = GetEdad();
        int ServicioPensionado = GetServicio();
        int UltimoSalarioPensionado = GetUltiSalario();

        if (EdadPensionado >= EdadMinima && ServicioPensionado >= PensionServicio) {
            EsLegible = true;
            PensionBase = 0.70f * UltimoSalarioPensionado;
            int aniosExtra = ServicioPensionado - 25;
            porcentajePension = 70 + Math.min(aniosExtra, 20);
            porcentajePension = Math.min(porcentajePension, 90);
            float PensionFinal = (porcentajePension / 100) * UltimoSalarioPensionado;
            System.out.println("Pensión Final: " + PensionFinal);
        } else {
            EsLegible = false;
        }
    }

    public void MostrarDatos() {
        if (EsLegible) {
            System.out.println("Es elegible para jubilación.");
        } else {
            System.out.println("No es elegible para jubilación.");
        }
    }
}

public class SistemaPension {
    public static void main(String[] args) {
        CalcularJubilacion datosJubilado = new CalcularJubilacion();
        datosJubilado.miPension();
        datosJubilado.MostrarDatos();
    }
}
