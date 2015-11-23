
public class JavaCleanVisitor implements Visitor {

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

	//@Override
//	public void visit(Directory d) {
//		// TODO Auto-generated method stub
//
//		java.util.Iterator<ElementStockage> iter = d.listeDossier.iterator();
//		while (iter.hasNext())
//		{
//					
//			(iter.next()).accept(this);
//		}
//			
//	}

	@Override
	public void visitBeforeDirectory(Directory f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitAfterDirectory(Directory f) {
		// TODO Auto-generated method stub
		
	}
	
	
}
