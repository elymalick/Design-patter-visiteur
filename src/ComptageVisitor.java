
public class ComptageVisitor implements Visitor{
	int count=0;
	@Override
	public void visit(Link l) {
		// TODO Auto-generated method stub
//		if(l.size() >=10)
//		{
//			count++;
	//	}
		//count++;
	}

	@Override
	public void visit(Symlink s) {
		// TODO Auto-generated method stub
//		if(s.size() >=10)
//		{
//			count++;
//		}
		//count++;
	}
	
	@Override
	public void visit(File f) {
		// TODO Auto-generated method stub
//		if(f.size() >=10)
//		{
//			count++;
//		}
		count++;
	}

	//@Override
//	public void visit(Directory d) {
//		
//		count++;
//		// TODO Auto-generated method stub
//		if(d.size()!=0)
//		{
//			d.basicSize = 0 ;
//		}
		
		
	//	java.util.Iterator<ElementStockage> iter = d.listeDossier.iterator();
		//while (iter.hasNext())
	//	{
		//	(iter.next()).accept(this);
	//	}
				
	//}
	
	public int getCount()
	{
		return this.count -1;
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
