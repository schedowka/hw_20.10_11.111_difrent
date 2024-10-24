public class Main {
    public static void main(String[] args) {


        int [] birthYears = {1990, 1985, 1978, 2000, 1965, 1995, 1980, 1970, 2003, 1998,
                1963, 1975, 1988, 1992, 1983, 2002, 1991, 1969, 1973, 1960,
                1977, 1986, 1999, 2005, 1984, 1968, 1976, 1987, 1994, 1962 };
        int minyear = birthYears[0];
        int maxyear = birthYears[0];
        for (int Year : birthYears) {
            if (Year < minyear) {
                minyear = Year;
            }
            if (Year > maxyear) {
                maxyear = Year;
            }
        }

            int current = 2024;
            int oldest = current - minyear;
            int youngest = current - maxyear;
            int diffrent = oldest - youngest;

            System.out.println(oldest);
            System.out.println(youngest);
            System.out.println(diffrent);


        
    }
}