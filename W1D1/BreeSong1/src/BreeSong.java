
public class BreeSong {

	public static void main(String[] args) {
		int beerNum=99;
		String word="botteles";
		while (beerNum>0){
			if (beerNum==1){
				word="bottle";
			}
			System.out.println(beerNum +" "+  word+" "  + "of bree on the wall");
			System.out.println(beerNum +" "+ word +" "+" of bree.");
			System.out.println("take one down.");
			System.out.println("pass it around");
			beerNum=beerNum-1;
			if (beerNum>0){
				System.out.println(beerNum+"  "+ "of bree on the wall");
			}else{
					System.out.println("no more bottle of bree on the wall");
				}
			}
			
		}
		// TODO Auto-generated method stub

	}


