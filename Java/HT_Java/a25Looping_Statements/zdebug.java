package a25Looping_Statements;

/*
 * debug chaitaniki manaki a line nunchi kavalo aa line dagara break point petukovali.
 * execute cheasatapudu execution aa break point dagara aagutundi apudu maanam "f5 (or) f6"
   aa rendintilo ado vakati press chesi execution chudochu.
   f5 --> adina line lopalki velli antea f5 press chestamu.
   f6 --> adina line nunchi verea line ki vellali antea f6 press chestamu.
 * debug cheseatapudu break point ala petali antea 3 types lo petochu :
   1. direct ga a line dagara break point petlo aka number untadi dani paka blue line untadi
      akada double click chestea saripodi.
   2.  a line nunchi manam debug chaiyalo aa line paina click cheasi run loki velli toggle 
       break point ani untadi dani pai click cheasina saripodi.
   3. direct ga a line dagara break point petlo aka number untadi dani paka blue line untadi
      akada right click echi toggle break point ani untadi dani pai click cheasina saripodi.
      
 * mana adina line execution kavli antea aa line pai click cheasi right click echi watch pai
   click chestea saripotundi, apudu execution inka neat ga kanipistundi.
 * debug ala "off" chaiyali antea right top upper corner lo close button kinda "j" ani untadi 
   dani pai click chestea saripotundi.
 */

public class zdebug {

	public static void main(String[] args) {

		int i = 0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
	}

}
