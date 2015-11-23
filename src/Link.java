
public class Link extends ElementStockage 
{
	private String contenu ;
	
	public Link(String nom)
	{
		super(nom,0) ;
		this.contenu="" ;
	}
 	public Link(String nom,String contenu)
	{
		super(nom,0) ;
		this.contenu=contenu ;
	}
	
	public int size()
	{
		return contenu.length()  ;
	}
	public void setContents(String c)
	//change le contenu du fichier. Le contenu devient c
	{
		contenu = c ;
	}
	
	public void accept(Visitor v)
	{
		v.visit(this);
	}
}