import java.time.LocalDate;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Incidente {
	private int idIncidente;
	private int idEmpleado;
	private int idCliente;
	private int idSoporte;
	private int idTecnico;
	private final LocalDate altaIncidente = LocalDate.now();
	private String fechaResolucion;
	private String horasColchon;
	private String estadoIncidente;
	
	public Incidente(int i, int empleado, int cliente, int soporte, int tecnico, String fechaReso, String colchon,
			String estado) {
		// TODO Auto-generated constructor stub
	}

	public static Incidente altaIncidente(){
		
		System.out.println("*****INGRESE LOS SIGUIENTES DATOS DEL INCIDENTE*****");
	    System.out.println("***********RESPETANDO LAS INDICACIONES*************");
		Scanner entrada = new Scanner(System.in);
		System.out.println();
		System.out.println("ID Empleado: ");
		int empleado = entrada.nextInt();
		System.out.println("ID Cliente: ");
		int cliente = entrada.nextInt();
		System.out.println("ID Soporte: ");
		int soporte = entrada.nextInt();
		System.out.println("ID tecnico: ");
		int tecnico = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Fecha de resolución:dd/mm/aaaa ");
		String fechaReso = entrada.nextLine();
		System.out.println("Colchon de hs en (hs): ");
		String colchon = entrada.nextLine();

		//en alta de incidente el estado por defecto será REPORTADO
		String estado = "REPORTADO";
		
		
		Incidente inc1 = new Incidente(1,empleado,cliente,soporte,tecnico,fechaReso,colchon,estado);
			
		//System.out.println(inc1.toString());

		entrada.close();
		return inc1;
	}

	public int getIdEmpleado() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getIdCliente() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getIdSoporte() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getIdTecnico() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getFechaResolucion() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getHorasColchon() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEstadoIncidente() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
