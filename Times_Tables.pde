int rows = 5;
int cols = 6;
int exp = 3;
long [][] tt;
void setup() {
  tt = TTE.ttexp(rows, cols, exp);
  print_ttexp(tt);
}

void print_ttexp(long [][] tt ) {
  for (long [] rows : tt) {
    for (long cols : rows) {
      print("\t");
      print(cols);
    }
    println();
  }
}
