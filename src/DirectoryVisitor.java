
public class DirectoryVisitor implements Visitor {
	public void visit(Link l)
	{
	
	}
	public void visit(Symlink s)
	 
		
	}
    public void visit(File f)
    {
    
	}
	public void visit(Directory e)
	{
		//v.visitDirectory(this);
		for(ElementStockage v : e.listeDossier )
		{
			this.visit(e);
		
		}
		
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
