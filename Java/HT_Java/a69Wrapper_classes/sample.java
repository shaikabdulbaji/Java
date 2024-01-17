package a69Wrapper_classes;

import java.util.ArrayList;

/*
 * java is 100% object oriented programming language aa kada antea --> answer is "NO".
   nduku antea manki e primitive data types yoka concept valla java 100% oop language kadu. 
   adi ala antea
   for ex : int i=20;
   edi manaki class aa kadu, edi manaki object aa kadu, leka edi amana class ni extend chestunda kadu.
   manki 100% oops antea prathidi 100% objects rupam lo undali.
   
   ala itea asalu e primitive data types anea concepts java lo nunchi tisestea manaki 100% oop 
   language aavutadi kada java.
   
   manki data aneadi store aavali antea e primitive data types kavali evi tisestea manaki adana data 
   store chaiyali antea prathi sari manam object aneadi create chaiyali ala prathi china data ki 
   objects create chesthu veltea manki main ga performance undadu and memory consumption akuva 
   aavutundi and garbage collector ki kuda work undi e object ni clear chaiyatniki edanta pedha 
   process edi ami leakunda undataniki e primitive data types anea concept unchalsochindi java lo.
   
   e paindi antha asal process.
   
   manaki java collections anea framework ki apudu introduce cheasindo apudu e primitvie data types ni 
   collections lo use chaiyaleamu ani rule petindi java.
   manaki collections lo em untai antea multiple data structures untai. data structures antea 
   "Arraylist, Linkedlist, map etc..  elantivi". 
   e data structures ni nduku use cheasukuntamu manam antea data ni store cheasukotaniki in certain 
   way lo. mari data ni ni data structures loki ala save cheasukuntamu antea, deni overcome
   chaiyatniki and 100% oops denini justify chaiyataniki, vetinanitini ni drustilo petukoni java 
   vaka kotha concept ni introduce cheasindi dani perea "Wrapper Classes".
   
   e Wrapper classes enti antea e primitive data ni vaka class wrapp chestundi danea wrapper cllasses
   antaru. (Simple ga manam evarikana gift evalantea direct ga evamu kadu dani ado vaka gift cover tho 
   cover cheasi estamu adea wrapping).
   
   similar ga collections framework kosam objects kavali and collections framework lo e primitive data
   types ni use cheasukokudadu, everthing should be in the form of objects, object la undali antea 
   manki class kavali. manam e primitive data tye lo data ni hold cheasi daniki class tho wrapp cheasi
   objects ki estamu.
   
   e wrapper class lo primitive data type ala untundi antea.
   
   byte --> Byte
   short --> Short
   int --> Integer
   double --> Double
   float --> Float
   long --> Long
   char --> Character
   boolean --> Boolean
   
   mostly 99% class names aneavi ani "capital latters" tho start aavutai, akadea manaki ardam aavtundi.
   
   manam adana primitive data ni class no use cheasukovali antea object create chaiyali ala create 
   chaiyali antea class kavali.
   
   denilo 2 types untai 
   1. Boxing
   2. Unboxing.
   
   int i=20;
   Integer i2 = new Integer(i); 
   System.out.println(i2);
   Integer(i) --> edi deprecate iundi nduku antea java-9 tarvata edi deprecate cheasaru. deprecate 
   antea java team vallu adana method ni remove chaiyali antea dani 1st deprecate chestaru nduku antea
   dani direct ga remove chestea aa method use chesa project effect or fail aavutai anduku 1st a 
   remove chaiyakunda deprecate chestaru.
   ela deprecate ina methods ni mostly ignore chaiyatamea manchidi nduku antea java team vallu aa 
   method ni apudaina remove chiyavachu anduku.
   
   paina method deprecate indi kada daniki alternative ga inko method use chesukovali ad
   Integer i2 = new Integer(i); deniki alternative ga --> Integer i2 = Integer.valueOf(i);
   
   
   Boxing - primitive data ni primitive data ki sambandinchina object lo petamanuko wrapper classes 
   use cheasi dani boxing antamu.
   eg : 
   int i=20;
   Integer i2 = new Integer(i); 
   			(or)
   Integer i2 = Integer.valueOf(i); 
   System.out.println(i2);
   
   Auto-Boxing - int data ni direct ga assign chaiyatam.
   
   Unboxing - Already object lo una data ni techi vaka primitive data type ki assign chestea dani
   unboxing antamu.
   
 */

public class sample {

	public static void main(String[] args) {

		int i=20;
		
		//Integer i2 = new Integer(i); //deni boxing antamu. (edi manam manual ga estunam)
		Integer i2 = Integer.valueOf(i);
		System.out.println(i2);
		
		Integer i3 = i; //deni auto-boxing antamu.(edi direct ga java tisukuntundi)
		System.out.println(i3);
		
		Integer i4 = Integer.valueOf(65);
		int i5 = i4.intValue(); //edi unboxing (edi manam manual ga estunam)
		int i6 = i4; // ela direct ga estea deni auto-unboxing antamu (edi direct ga java tisukuntundi)
		System.out.println(i5);
		System.out.println(i6);
		
		/*
		 * asal edanta nduku chepukunamu antea collections lo direct ga primitive data ni use 
		   chesukoleamu kani manam primitive data ni collections lo use cheasukovali antea wrapper 
		   classes use cheasi use cheasukovachu.
		   
		 * ArrayList<int> al = new Arraylist<>(); manam ela arraylist vakati create cheasi chustea 
		   akada int dagara error chupistadi, ala rakudadu antea manam dani wrapper class kinda use
		   chestea radu.
		 */
		
		//ArrayList<int> al = new Arraylist<>();
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10); //edi auto-boxing (direct)
		al.add(50);
		
		//asal general ga itea ekada manam integer yoka objects ni add chaiyali, edi ala antea.
		
		//al.add(new Integer(65)); //edi deprecate iendi kabati deni alternative use cheasukovachu
		//al.add(Integer.valueOf(65)); //edi boxing (manual)
		
		//edi vaka add lonea kadu get lo kuda use iedi.
		Integer age = al.get(0);
		int age1 = al.get(0);
		
		
		//Normal ga manam type converstion lo nerchukundi enti antea
		byte b = 20;
		double d = b;
		double d1 = 10.55;
		//short s = d1; 
		/*
		 * ela rastea error vastadi, deni direct ga assign chaiyaleamu anduku deniki type converstion
		   use chesamu.
		 */
		short s = (short)d1;
		
		String str = "14";
		//int i8 = (int)str; //edi conversion kadu error through cheasidi.
		int i9 = Integer.valueOf(str); //elanti vataiki wrapper classes manchi method ni techai valueOf()
				  //(or)
		int i10 = Integer.parseInt(str); //edi string ki integer ni parse or pass or conversion.
		System.out.println(i9);
		System.out.println(i10);
		
		Long lo = Long.valueOf(str); // (or) long lo = Long.valueOf(str);
		System.out.println(lo);
		int iage = lo.intValue();
		System.out.println(iage);
		
		long lo1 = Long.parseLong(str);
		System.out.println(lo1);
		
		
		//vaka chinna example asal manam echina primitive data wrapper class la ala untundo chudali
		Integer ii = 35;
		/*
		 * pai line lo "Integer" pai click cheasi "fn+f3" press chestea aa Integer page loki velidi 
		   akada internal ga aa value primitive data nea hold cheasi unchutadi, denea wrapping of 
		   primitive data is called wrapper classes antamu.
		*/
		
	}

}
