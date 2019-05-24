package ua.lviv.lgs.Lesson_11_2;

public class Kermo {
	
	private int diametr;
	private String material;
	
	public Kermo(int diametr, String material) {
		super();
		this.diametr = diametr;
		this.material = material;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return " Kermo [diametr=" + diametr + ", material=" + material + "]";
	}
	
	
	
	

}
