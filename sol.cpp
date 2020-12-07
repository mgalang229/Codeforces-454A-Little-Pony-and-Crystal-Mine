#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int n;
	cin >> n;
	vector<int> v;
	for(int i=1; i<=n; i+=2)
		v.push_back(n-i);
	for(int i=n-2; i>=1; i-=2)
		v.push_back(n-i);
	for(int i=0; i<n; ++i) {
		for(int j=0; j<n; ++j) {
			if(j<v[i]/2||j>n-(v[i]/2+1))
				cout << '*';
			else
				cout << 'D';
		}
		cout << "\n";
	}
}
