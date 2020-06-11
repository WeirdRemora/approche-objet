package interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] tabObj = new ObjetGeometrique[2];
		Cercle c = new Cercle(5);
		Rectangle r = new Rectangle(2,3);
		tabObj[0]=c; 
		tabObj[1]=r;
		for (int i=0 ; i < tabObj.length ; i++) {
			System.out.println("périmètre objet "+i+" : "+tabObj[i].perimetre());
			System.out.println("surface objet "+i+" : "+tabObj[i].surface());
		}
	}

}
