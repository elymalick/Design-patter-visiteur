import java.util.Collection;
import java.util.HashMap;

public interface IArchive 
//interface IArchive
{
	public boolean add(ElementS ckage e) ;
	public HashMap getContent() ;
	public void extract() ;
	public Collection findR(String name) ;
}