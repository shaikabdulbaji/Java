package a56Memory_Management_in_Java;

public class aSample {
	
	/*
	 1. What is memory management?
	 * Memory manage chaiyatanea memory management antamu.
	 * memory lo 2 types untai RAM, ROM
	 * ROM - Permanent memory
	 * RAM - Temporary memory
	 * manam in general ga vaka photo tisina leka vaka video tisina dani ROM lo store chestundi
	   system default ga.
	 
	 * mari RAM lo em store itai antea mana amana rastunamu anuko save chaikunda adi RAM lo store
	   iedi leka vaka photo tisina save chaikunda adi RAM lo store iedi leka amana excel lo amana 
	   data estuna anuko save chaikunda adi RAM lo store iedi koni sarlu chepalantea temporary ga
	   store iea clipboard kuda RAM lo store iedi.
	   adina save chaiyaka mundhu daka RAM lo store iedi, save cheasina taravat RAM lo store iedi.
	   
	   
	 2. Understand he different memory areas?
	 * asal manam epati daka memories gurinchi chepukunam kada malli e memory areas enti antea.
	 * mana system direct ga mana variables kani objects kani memory meda store chestea amana 
	   access issues ala vastai diniovercome chaiayataniki system jvm ki kontha memory aneadi 
	   allocate chestadi java danea use cheasukuntadi.
	 * memory areas lo 3 types of memory areas or runtime data areas untai :
	   memory areas or runtime data areas both are same.
	   1. Stack Area
	   2. Metaspace/PermGen
	   3. Heap Area
	   	  Stringpool.
	   	   	  
	 * System java kosam allocate cheasina memory ni "Native Area" antamu.
	 
	 Heap Area :
	 ---------
	 1. Objects ni and Arrays ni and String literals ni store cheasukotaniki heap area use chestanu.
	    kani string ni store cheasukotaniki "String Pool" aneadi use chestamu.
	 2. Indirect ga String pool kuda heap area lonea untai.
	 3. kani String pool aneadi heap area lo vaka part.
	 4. Arrays are part of objects.
	 5. Objects lo instance variables and methods
	    Objects = instance variables + methods.
	 
	 Stack Area :
	 ----------
	 1. stack area lo variables ni and reference variables ni store chestaamu.
	 
	 Metaspace/PermGen :(after 1.8v introduce cheasaru)
	 -----------------
	 1. Metaspace/PermGen area lo class structure and staic code(static variables and static methods
	    and static blocks)
	 
	 */

}
