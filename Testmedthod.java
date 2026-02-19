public class Testmedthod {
    public static void main(String[] args) {
        int totalNumbers = 100;
        int numbersPerLine = 10;

        for (int i = 1; i <= totalNumbers; i++) {
            // เรียกใช้ method และพิมพ์ออกมาด้วย format %7d
            System.out.printf("%7d", getPentagonalNumber(i));

            // ถ้าพิมพ์ครบ 10 ตัว ให้ขึ้นบรรทัดใหม่
            if (i % numbersPerLine == 0) {
                System.out.println();
            }
        }
    }

    // Method คำนวณเลขห้าเหลี่ยมตามสูตรที่โจทย์ให้มา
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}