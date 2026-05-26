 bool isPalindrome(int x) {

    int original = x;
    long long reverse = 0;
    int digit;

    if(x < 0)
        return false;
    while(x > 0) {
        digit = x % 10;
        reverse = reverse * 10 + digit;
        x = x / 10;
    }

    if(original == reverse)
        return true;
    else
        return false;
}
