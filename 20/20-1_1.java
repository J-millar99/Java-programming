class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int Z = input.nextInt();
        Random rand = new Random();
        int max, min;
        if (A < Z) {
            max = Z;
            min = A;
        }
        else {
            max = A;
            min = Z;
        }
        int rn;
        for (int i = 0; i < 10; i++) {
            rn = min;
            rn += rand.nextInt(max - min + 1);
            System.out.println(rn);
        }
    }
}