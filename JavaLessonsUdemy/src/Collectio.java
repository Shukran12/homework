import java.util.*;
// 1. HashSet  -- Collectionda olan deyerli sirasi olmadan nece geldi yazir
// 2. HashSer.remove() Collectionda  olan deyeri silir
// 3. HashSet.clear() Collectioni sifiralyir
//4. HashSet.contains() Collectionda olan deyer var ya yoxdur onu boolean olaraq qaytarir
// burda index deyeri olmadigi ucun bir basa deyeri contains("deyer") seklinde yaziriq

// 5. HashSetde eyni deyer yalniz 1 defe yazilir
public class Collectio {
    public static void hashSet(){
        HashSet h = new HashSet<>();
        h.add("salam");
        //h.add(true);
        h.add(12.543);
        h.add(12.543);
        h.add(null);

       // h.remove("salam");

        System.out.println(h.toArray()[2]);


    }

    public static void linkedHashSet(){
        // LinkedHashSet burda deyerler sirali ve haslanmis formada olur

        LinkedHashSet linkedHashSet  = new LinkedHashSet<>();
        linkedHashSet.add("Bazarertesi");
        linkedHashSet.add("Cersenbe Axsami");
        linkedHashSet.add("Cersenbe");
        linkedHashSet.add("Cume Axsami");
        linkedHashSet.add("Cume");
        linkedHashSet.add("Senbe");
        linkedHashSet.add("Bazar");

        //linkedHashSet.forEach(item -> System.out.print(item +","));
        System.out.println(linkedHashSet.toArray()[1]);

    }


    public static void treeSet(){
        //1. TreeSet girilen deyerli asagidan yuxari siraliyir
        //2. TreeSet null deyeri almir

        TreeSet treeSet = new TreeSet<>();

        treeSet.add(13);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(55);

        System.out.println(treeSet);
    }


     public static void arrayList(){
        // Arraylistlerde eyni data elave edende 2sinde yazir
         // ArrayList itemlero gostremekde Suretlidir
         // Arraylist itemleri silmekde Zeifdir

         // ArrayList itemleri elave edende de Zeifdir
         // Arraylist Axtarmaqda Suretlidir
         ArrayList arrayList = new ArrayList();
         arrayList.add("Turkiye");
         arrayList.add("Gurcustan");
         arrayList.add("Norvec");
         arrayList.add("Isvec");
         arrayList.add("Danimarka");
         arrayList.add("Almanya");

         arrayList.add(1, "Macaristan");
         System.out.println(arrayList.get(2));
         //arrayList.forEach(i -> System.out.println(i));


     }

     public static void likedList(){
        // LinkedList Axtarisda Zeifdir
         // LinkedList Elave edende Suretlidir
         // Itemler bir biri ile elaqeli Sekilde Qalir
         // LinkedList silmede de suretlidir
         // Ancaq gostermek(select) de zifdir

         LinkedList linkedList = new LinkedList();
         System.out.println(linkedList.size());

    }

    public static void vector(){
        // Vector LiFo mentiqi ile isleyir yeni last in First Out
        // Vector kohne sistemdir

        // Vectorda Capasity yeni [tutumu] teyin ede bilirik
        Vector vector = new Vector(4,1);

        vector.add("baki");
        vector.add("seki");
        vector.add("quba");
        vector.add("qusar");
        vector.add("samaxi");

        System.out.println(vector);
        System.out.println(vector.capacity());
        System.out.println(vector.get(2));

    }

    public static void queue(){
        // Lifo Mentiqi Islenir
        // offer - collectiona deyeri teklif edir eger uygundursa daxil edir
        // remove collectionda olan ilk deyeri qaytarir ve sonra silir
        // element() collectionda olan ilk deyeri gosterir bossa hec ne elemir
        // peek()--- collectionda olan ilk deyeri qaytarir ancaq bos ise null verir

        Queue queue = new LinkedList();
        queue.add("Tst");
        queue.add("Tst1");
    }

    public static void prortyQueue(){
        Queue proity = new PriorityQueue();
        // verilen deyerleri istediyimiz sekilde siralanmasi ucun isledirik

    }

    public Collectio() {
       // hashSet();
       // linkedHashSet();
       /// treeSet();
       // arrayList();

       // likedList();
        vector();
    }

}
