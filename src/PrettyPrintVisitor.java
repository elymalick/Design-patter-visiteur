
public class PrettyPrintVisitor implements Visitor{

	@Override
	public void visit(Link l) {
		// TODO Auto-generated method stub
	//	System.out.println(l.getClass().getName()+" "+l.name);
		System.out.println(l.name);
	}

	@Override
	public void visit(Symlink s) {
		// TODO Auto-generated method stub
		System.out.println(s.name);
	}

	@Override
	public void visit(File f) {
		// TODO Auto-generated method stub
		
		System.out.println(f.name);
	
	}

//	@Override
//	public void visi(Directory d) {
//		// TODO Auto-generated method stub
//		
//	
//	
//		
//	}

	@Override
	public void visitBeforeDirectory(Directory f) {
		// TODO Auto-generated method stub
		//System.out.println(	f.getClass().getName() +" "+d.name);
		
		
		
		java.util.Iterator<ElementStockage> iter = f.listeDossier.iterator();
		while (iter.hasNext())
		{
			if(iter.equals(f))
			{
				visitAfterDirectory(f);
			}
			else
			{
				(iter.next()).accept(this);
			}
		//System.out.println(iter.getClass().getName());
			
			
		}
	}

	@Override
	public void visitAfterDirectory(Directory f) {
		// TODO Auto-generated method stub
		java.util.Iterator<ElementStockage> iter = f.listeDossier.iterator();
		while (iter.hasNext())
		{
		//System.out.println(iter.getClass().getName());
			
			(iter.next()).accept(this);
		}
	}

}
