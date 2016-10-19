package admintareas

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

class Conexion {
	
	public Conexion(){
		
	}
	
	public void registrar(ArrayList <Tarea> tareas){
		FileWriter fw = null;
		PrintWriter pw=null;
		
		try{
			fw=new FileWriter("C:\\Fichero.txt");
			pw=new PrintWriter(fw);
			for(int i=0; i<tareas.size; i++){
				pw.println (tareas.get(i).nombreTarea);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(null!=fw){
					fw.close();
				}
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
	}
	
	public ArrayList<Tarea> consultar()throws IOException{		
		ArrayList <Tarea> tareas = new ArrayList <Tarea>();
		String tarea;
		
		FileReader fr=new FileReader("C:\\Fichero.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while((tarea=br.readLine())!=null){
			Tarea t=new Tarea(tarea);
			tareas.add(t);
		}
		
		br.close();
		fr.close()
		return tareas;
	}
	
	public void borrar(ArrayList <Tarea> tareas){
		registrar(tareas);
	}
}

