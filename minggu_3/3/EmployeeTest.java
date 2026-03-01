public class EmployeeTest { 
    public static void main(String[] args) { 
        Employee[] staff = new Employee[3]; 

        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989); 
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991); 
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993); 

        System.out.println("--- Data Karyawan Awal ---");
        for (int i = 0; i < 3; i++) { 
            staff[i].print(); 
        }

        System.out.println("\n--- Hasil Uji Metode compare ---");
        int hasilCompare = staff[0].compare(staff[1]);
        System.out.println("Perbandingan gaji Antonio vs Maria: " + hasilCompare);
        if (hasilCompare == -1) {
            System.out.println("Gaji Antonio lebih kecil dari Maria.");
        }

        System.out.println("\n--- Data Karyawan Setelah Diurutkan Berdasarkan Gaji ---");
        Sortable.shell_sort(staff); 
        
        for (int i = 0; i < 3; i++) { 
            staff[i].print(); 
        }
    }
}