
public  interface Visitor{
	
    public void visit(File f);
		public void visit(Symlink s);
		public void visitBeforeDirectory(Direct y f);


		public void visitAfterDirectory(Directory f);


		public void visit(Link f);

}
//	
//	public abstract class Visitor {
//
//		public void visitFile(File f){}
//
//		public void visitBeforeDirectory(Directory f){}
//
//
//		public void visitAfterDirectory(Directory f) {}
//
//
//		public void visitLink(Link f) {};
//
//}
//}
