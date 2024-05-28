#include<stdio.h>
#include<conio.h>
#include<string.h>
int main()
{
    string findsum(string X,string Y){
        int i=X.size()-1,j=Y.size()-1;
        int sum=0,carry=0;
        string s="";
        while(i>=0 && j>=0){
            sum=X[i]-'0'+Y[j]-'0';
            sum += carry;
            carry = sum/10;
            sum = sum%10;
            s+=to_string(sum);
            i--,j--;
        }
        while(i>=0)
        {
            sum=X[i]-'0';
            sum+=carry;
            carry=sum/10;
            sum=sum%10;
            s+=to_string(sum);
            i--;
        }
        while(j>=0)
        {
            sum=Y[j]-'0';
            sum+=carry;
            carry=sum/10;
            sum=sum%10;
            s+=to_string(sum);
            j--;
        }
        if(carry!=0)
        {
            s+=to_string(carry);
        }
        int k=s.size()-1;
        while(k>=1 && s[i]=='0')
        {
            s.pop_back();
            k--;
        }
        reverse(s.begin(),s.end());
        return s;
    }    


}