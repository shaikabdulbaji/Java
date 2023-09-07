package a66StingBuffer_and_StringBuilder;

/*
 * StringBuilder 1.5v nunchi undi.
 * StringBuilder is non-synchronized and it is for single thread.
 * It is thread safe.
 */

public class dStringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("abdul");//24
		//sb1.insert(4, "sk"); // manakai a index position kavali antea akada insert cheasukovachu.
		//sb1.deleteCharAt(5); // manakai a index position kavali antea akada delete cheasukovachu.
		//sb1.delete(1, 3);// manakai a vaka part of index position kuda delete cheasukovachu.
		//sb1.reverse(); // manam echina string ni reverse cheasukovachu.
		sb1.ensureCapacity(90);// denitho manaku ntha capicity tho string kavaalo antha capacity esta akada varaku adjust aavutundi.
		System.out.println(sb1.capacity()); //manam em evakapotea default ga 16 vastadi. inka manam ntha string estea antha chracters motham indexes chupinchidi.
		System.out.println(sb1);
		StringBuilder sb2 = new StringBuilder("abdul");//30
		
		System.out.println(sb1.compareTo(sb2));//same itea "0", same kakapotea negative value vastadi.
		
		System.out.println(sb1==sb2);
		
		sb1 = sb1.append("shaik");//26
		System.out.println(sb1==sb2);
		
		StringBuilder sb3 = new StringBuilder("abdul baji");//44
		System.out.println(sb1==sb3);
		
		
	}

}
