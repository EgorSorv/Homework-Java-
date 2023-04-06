package org.example.hw.sem6;

import org.example.hw.sem6.model.Filter;
import org.example.hw.sem6.model.Laptop;
import java.util.HashSet;
import java.util.Set;

public class ex {
    public static void main(String[] args) {
        Set<Laptop> set = new HashSet<>();

        set.add(new Laptop("Samsung Galaxy Book NP750XDA-KD1US", "Samsung", 8, "Windows", "SSD", 256, 55264));
        set.add(new Laptop("MSI Modern 15 B12M-211RU", "MSI", 8, "Windows", "SSD", 256, 34999));
        set.add(new Laptop("Apple MacBook Air", "Apple", 8, "MacOS", "SSD", 512, 132499));
        set.add(new Laptop("Samsung Galaxy Book NP750XDA-KD2US", "Samsung", 16, "Windows", "SSD", 256, 71170));
        set.add(new Laptop("Acer A315-23", "Acer", 8, "Linux", "SSD", 256, 29999));
        set.add(new Laptop("HP Dev One", "HP", 16, "Linux", "SSD", 1000, 85722));
        set.add(new Laptop("Acer A315-58-52HC", "Acer", 8, "Windows", "HDD", 1000, 44999));
        set.add(new Laptop("Acer TravelMate TMP259-G2-MG-56LC", "Acer", 4, "Linux", "HDD", 500, 31699));
        set.add(new Laptop("ASUS D541NA-GQ316", "ASUS", 4, "Linux", "HDD", 500, 15990));
        set.add(new Laptop("Apple MacBook Pro", "Apple", 16, "MacOS", "SSD", 512, 169999));
        set.add(new Laptop("Apple Macbook Pro", "Apple", 8, "MacOS", "SSD", 256, 104899));
        set.add(new Laptop("Lenovo IdeaPad 3 15IGL05", "Lenovo", 4, "Windows", "HDD", 1000, 25999));
        set.add(new Laptop("Lenovo ThinkPad X1 Carbon Gen 10", "Lenovo", 16, "Windows", "SSD", 256, 231999));
        set.add(new Laptop("HUAWEI MateBook D 15 BOD", "HUAWEI", 8, "Windows", "SSD", 256, 39999));
        set.add(new Laptop("ASUS ROG GL702VM-GC460", "ASUS", 16, "Linux", "HDD", 1000, 77490));
        set.add(new Laptop("HUAWEI MateBook D 14 NbE-WDH9AL", "HUAWEI", 8, "Windows", "SSD", 512, 49999));
        set.add(new Laptop("MSI Titan GT77 12UHS-208RU", "MSI", 64, "Windows", "SSD", 3000, 393999));
        set.add(new Laptop("Apple MacBook Pro", "Apple", 32, "MacOS", "SSD", 1000, 362999));
        set.add(new Laptop("MSI Creator Z17 A12UGST-254RU", "MSI", 32, "Windows", "SSD", 1000, 217999));
        set.add(new Laptop("MSI Prestige 14 EVO A12M-249RU", "MSI", 16, "Windows", "SSD", 512, 69999));

        Filter.program(set);
    }
}
