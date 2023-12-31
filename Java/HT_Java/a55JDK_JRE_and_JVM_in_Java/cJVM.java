package a55JDK_JRE_and_JVM_in_Java;

public class cJVM {
	
	/*
	 JVM - Java Virtual Machine.
	 * jvm lo chala untai, danilo koni
	   JVM = class loader sub system + Runtime data area + Execution engine + Native libraries.
	   
	   JDK lo .java files untai
	   JRE lo .class ga martai aa .java files.
	   JVM lo machine understandable code/interpreted code untadi.
	   
	   jre lo Runtime tools unai kada malli ekada Runtime data area nduku antea aa runtime tools 
	   program ni jvm loki push chestai asal kadha antha jvm lo untadi.
	   
	   e jvm kosam ekada vaka image attach cheasamu danilo clear ga and indepth ga undi matter.
	   
	   JVM = class loader sub system + Runtime data area + Execution engine + Native libraries.
	   
	   class loader sub system :
	   -----------------------
	   e class loader sub system lo 3 components untai.
	   1. loading  
	   2. linking  
	   3. initialization 
	       	   
	   1. loading aneadi jre lo una .class files ni execute cheaseatapudu aa class files ni load 
	   	  cheasi petukotaniki e loading anea compartment use aavutundi.
	      e loading lo kuda 3 components untai :
	      1. Bootstrap class loader  
	      2. Extension class loader  
	      3. Application class loader
	      	 ani 3 components untai.
	      1.Bootstrap class loader --> edi rt.jar lo una class files ni load cheasi petukotaniki 
	      							   use chestamu.
	      2.Extension class loader --> edi jre lo una lib lo una ext folder lo una libraries or jars
	       							   load cheasi petukuntundi. evi os param ga pani chestai.
	      3.Application class loader --> edi entantea manam e internal libraaries kakunda external 
	      								 ga amana libraries add cgeasamu anuko danilo ni classes 
	      								 load cheasi petukuntadi.
	      								 for eg :
	      								 java use cheasi excel file handle chaiyali antea java tho 
	      								 aavadu danikosam external ga koni libraries attach chestamu
	      								 like jxl or apache-poi e libraries lo una class files ni
	      								 load chaiyataniki edi use aavutadi.
	   2. linking 
	   	  e linking lo kuda 3 components untai :
	   	  1. verify
	   	  2. Prepare
	   	  3. Resolve
	   	  
	   	  1.verify --> e verify aneadi mana echina class file orginal byte code aa leaka amana 
	   	   			   external ga amana alter chaiyabadinda ani check chaiyataniki edi use 
	   	   			   chestamu.
	   	   				manam starting lo java 100% secure ani chepukunam adi edea ala ante
	   	   				manam pampinchina class file lo amana alter cheasi malware amana petara ani
	   	   				ekada verify lo internal ga bytecode verifier untadi adi check cheasidi.
	   	   				each and every line check cheasidi. danilo amana difference kanapaditea 
	   	   				verify anea exception throw cheasidi.
	   	  2.Prepare --> e prepare lo amana static variables estamu kada vatiki default values 
	   	  				assign cheasi pedtundi. like static int i; i=15 ani evachu adi tarvata 
	   	  				assign iedi.
	   	  3.Resolve --> e resolve aneadi symbolic references ni method reference ga change chestundi
	   	  				edi amana class file echinapudu dani bytecode verifier tho verify chestamu
	   	  				apudu akada constant pool ani vaka area untadi danilo mana rasina program
	   	  				aneadi symbol format lo akada untadi dani method reference format o change
	   	  				cheasi manaki estundi.
	   3. initialization :  edi manaki prepare lo static variables ki defsult values assign cheasidi
	   						ani chepukunamu kada vatiki amana values declare cheasamu anuko aa 
	   						values ni initialize cheasea pani initialization anea component 
	   						tisukuntadi.
	   						
	   e Runtime data area gurinchi next class lo discuss cheadamu like 56 class lo.
	   
	   Execution engine :
	   ----------------
	   e Execution engine lo kuda 3 phases unai
	   1. Interpreter
	   2. JIT compiler
	   3. Garbage Collection
	   
	   1. Interpreter --> e Interpreter aneadi byte code ni machine understandable code ga marustadi
	   					  compiler aneadi class file ni byte code la convert chestadi.
	   					  Interpreter aneadi byte code ni machine understandable code ga marustadi
	   					  antea vako line ni interpret chestundi native method interface sahayam tho
	   					  chestadi.
	   2. JIT compiler --> deni pani entantea mana program lo amana repeted ga or 100 times same 
	   					   line undanuko dani catch cheasi interpreter ki cheptundi.
	   3. Garbage Collection --> deni pani enti antea mana apudaina variables ni objects ni delete
	    					   	 cheasama chache la aa clean cheasea pani "Garbage Collection"
	    					   	 tisukuntundi.
	    					   	 
	   evani cheaseatapudu "Native method interface" and "Native method libraries" use aavutai.
	   
	 */

}
