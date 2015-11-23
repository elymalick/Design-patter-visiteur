import java.util.ArrayList;
import java.util.Collection;


public class FindVisitor implements Visitor{

	
	 //Collection<dossier> listeDossier;
	@Override
	public void visit(Link l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Symlink s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(File f) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void visit(Directory d) {
//		// TODO Auto-generated method stub
//	
//	
//		
//	}
	
	public ArrayList<String> find(String nom)
	//rend la collection des adresses absolues de nom "nom" que le repertoire contient
	{
		ArrayList<String> collection = new ArrayList<String>() ;
			
//		for (Directory s : listeDresse)
//		{
//			if (s.name.equals(nom))
//			collection.add(s.absoluteAdress()) ;
//		}
			
		return collection ;
	}

	@Override
	public void visitBeforeDirectory(Directory f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitAfterDirectory(Directory f) {
		// TODO Auto-generated method stub
		
	}

	
		
	
}
