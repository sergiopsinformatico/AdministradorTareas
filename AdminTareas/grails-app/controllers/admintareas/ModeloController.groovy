package admintareas

class ModeloController {
	
	Conexion model=new Conexion();
	ArrayList <Tarea> tareaList = new ArrayList <Tarea>();
	

    def index() { 
				
		tareaList=model.consultar();
		render view:"/modelo/index",model:[tareas:tareaList];
		
	}
	
	
	def registrar(){
	
		if(params.tarea != ""){
			Tarea t= new Tarea();
			t.nombreTarea = params.tarea;
			
			try{
				tareaList.add(t);
			}catch(Exception e){
				e.printStackTrace();
			}
			model.registrar(tareaList);
		}
		

		
		render view:"/modelo/index",model:[tareas:tareaList];
		
	}
	
	
	
	def eliminar(){
		
		for(int i=0; i<tareaList.size; i++){
			if(tareaList.get(i).nombreTarea.equals(params.fila)){
				tareaList.remove(i);
				i=tareaList.size();
			}
		}
		
		model.borrar(tareaList);
		render view:"/modelo/index",model:[tareas:tareaList];
	}
}
