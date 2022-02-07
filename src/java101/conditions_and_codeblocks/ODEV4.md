# Ödev

Koşullar :

    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

```java
public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik Giriniz : ");
        heat = input.nextInt();
        if (heat < 5)
            System.out.println("Kayak yapabilirsiniz.");
        else if (heat <= 25) {
            if (heat <= 15)
                System.out.println("Sinemaya gidebilirsiniz.");
            if (heat >= 10)
                System.out.println("Pikniğe gidebilirsiniz.");
        }
        else
            System.out.println("Yüzmeye gidebilirsiniz.");
    }
}

    

```

Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.