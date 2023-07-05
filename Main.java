public class Main{
	public static void main(String[] args){

		Shoe shoes = new Shoe();
		shoes.setSize(37.5);
		shoes.setPrice(8500);

		Person naomi = new Person();
		naomi.setExtraMoney(9000);
		naomi.setShoeSize(37.5);

		Shoe[] naomiShoes = new Shoe[49];
		for(int i = 0; i < naomiShoes.length; i++){
			    naomiShoes[i] = new Shoe();
		}

		if (shoes.getPrice() <= naomi.getExtraMoney() && naomi.getShoeSize() == shoes.getSize() && naomiShoes.length < 50 ){
			System.out.println("You can afford your dream shoe");
				 } else {
					System.out.println("Work a liitle hard to get your dream shoe");
				}
			
}


	}