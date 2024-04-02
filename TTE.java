class TTE {
  public static long[][] ttexp(int rows_, int cols_, int exp_) {
    long [][] twoD = new long [rows_][cols_];
    for (int row = 0; row < rows_; row++) {
      for (int cols = 0; cols < cols_; cols++) {
        twoD[row][cols] = (long)Math.pow((cols + row*cols_)+1, exp_);
      }
    }
    return twoD;
  }
}
