# Value Types vs Reference Types

## Value Types (Primitive Types)
Disimpan di stack memory. Mewakili tipe data sederhana seperti integer, floating-point numbers, karakter, boolean, dan banyak lagi.

## Reference Types
Variabel menyimpan referensi (alamat memori) ke objek sebenarnya. Termasuk class, array, interface, enum, dan objek. Disimpan di heap memory.

Ada banyak perbedaan antara keduanya, namun yang paling mencolok adalah:
- Variabel dari tipe referensi menyimpan referensi ke data mereka (objek), sementara variabel dari tipe nilai langsung berisi data mereka.
- Dengan tipe referensi, dua variabel dapat merujuk ke objek yang sama; oleh karena itu, operasi pada satu variabel dapat mempengaruhi objek yang dirujuk oleh variabel lainnya.

## Contoh:

### Contoh Tipe Nilai (Value Type)

```java
public class ValueType {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 20;

        System.out.println("a: " + a); 
        System.out.println("b: " + b); 
    }
}
```

### Contoh Tipe Nilai (Reference Types)
``` java
public class Reference {
    int angka;

    public Reference(int angka) {
        this.angka = angka;
    }
    
    public static void main(String[] args) {
        Reference ref1 = new Reference(5);
        Reference ref2 = ref1;

        ref2.angka = 10;

        System.out.println("ref1.angka: " + ref1.angka); 
        System.out.println("ref2.angka: " + ref2.angka); 
    }
}
