# Java İle Çift Devreli Lig Fikstür Oluşturma

Bu proje, Java ile çift devreli lig usulüne göre rastgele maç fikstürü oluşturan bir sınıfı içerir. Girilen takımlar için ev sahibi ve deplasman olmak üzere, her takımın diğer takımlarla hem evinde hem deplasmanda maç yapacağı şekilde fikstür oluşturulur.

## Özellikler
- **Çift Devreli Lig Usulü**: Her takım, diğer takımlarla hem evinde hem de deplasmanda olmak üzere iki kez karşılaşır.
- **Çift Sayıya Tamamlama**: Eğer girilen takım sayısı tek ise, "Bay" (Boş hafta) adında bir takım eklenir. Bay ile eşleşen takımlar o hafta maç yapmaz.
- **Fikstür Gösterimi**: Fikstür, listenin sol tarafında ev sahibi ve sağ tarafında deplasman takımını gösterir.

## Kurallar
1. Her takım, diğer tüm takımlarla çift devreli lig usulüne göre karşılaşır.
2. Tek sayıda takım varsa, "Bay" adında bir takım eklenerek takım sayısı çift yapılır.
3. Bir hafta boyunca her takım bir kere maç yapar; "Bay" ile eşleşen takımlar o hafta maç yapmaz.

## Örnek Kullanım
Girilen takım listesi:
Takım A, Takım B, Takım C

### Fikstür Çıktısı:
1. Hafta:
   - Takım A - Takım B
   - Takım C - Bay

2. Hafta:
   - Takım A - Takım C
   - Bay - Takım B

3. Hafta:
   - Takım B - Takım C
   - Bay - Takım A


**Not**: Bu örnekte 3 takım girildiği için Bay eklenmiştir. Çift devreli ligde toplamda her takım diğerleriyle 2 kez karşılaşır.
