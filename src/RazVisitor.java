import javax.swing.text.html.HTMLDocument.Iterator;


public class RazVisitor implements Visitor {
	
	public void visit(Link l)
	{
		
		l.setContents("");
//		if(l.size()!=0)
//		{
//			l.basicSize = 0 ;
//		}
		
		
	}
	public void visit(Symlink s)
	{
		
		//s.setContents("");
//		if(s.size()!=0)
//		{
//			s.basicSize = 0 ;
//		}
//		
		
	}
    public void visit(File f)
    {
    	
    	f.setContents("");
//    	if(f.size()!=0)
//		{
//			f.basicSize = 0 ;
//		}
		
	}
   // public void add(ElementStockage component) {
  //      components.add(component);
  //  }

   
	public void visit(Directory d)
	{
	
//		if(d.size()!=0)
//		{
//			d.basicSize = 0 ;
//		}	
//			if(d instanceof Directory)
//			{
//				java.util.Iterator<ElementStockage> iter = d.listeDossier.iterator();
//				while (iter.hasNext())
//				{
//					(iter.next()).basicSize=0;
//				}
//			}
		
		
		java.util.Iterator<ElementStockage> iter = d.listeDossier.iterator();
		while (iter.hasNext())
		{
			(iter.next()).accept(this);
		}
		
	}	
	public void remettreaZero(ElementStockage e)
	{
		e.accept(this);
		
	}
	@Override
	public void visitBeforeDirectory(Directory f) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void visitAfterDirectory(Directory f) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
//	public void visit(MachineComposite mc) {
//		if (found == null && mc.getId() == soughtId) {
//		found = mc;
//		return;
//		}
//		Iterator iter = mc.getComponents().iterator();
//		while (found == null && iter.hasNext())
//		((MachineComponent) iter.next()).accept(this);
//		}
//		}

	
	
	
	
}
