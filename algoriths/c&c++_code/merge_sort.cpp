#include<iostream>
using namespace std;

void merge(int a[], int start, int end, int mid) {
  int n1 = mid - start + 1;
  int n2 = end - mid;
  int i, j;

  // create new arrays to store sub-arrays
  int b[n1];
  int c[n2];

  for (i = 0; i < n1; i++) // reading elements of first half into array b.
  {
    b[i] = a[start + i];
  }

  for (i = 0; i < n2; i++) // reading elements of second half into array c.
  {
    c[i] = a[mid + 1 + i];
  }

  i = 0;
  j = 0;

  int k = start;

  while (true) {
    if (i < n1 && j < n2) {
      if (b[i] < c[j]) {
        a[k] = b[i];
        k++;i++;
      } else {
        a[k] = c[j];
        k++;j++;
      }
    } else {
      if (i < n1) {
        a[k] = b[i];
        k++;i++;

      } else if (j < n2) {
        a[k] = c[j];
        k++;j++;
      } else {
        break;
      }
    }
  }
}


void mergeSort(int a[], int start, int end) {
  if (start < end) {
    int mid = (start + end) / 2;

    mergeSort(a, start, mid);
    mergeSort(a, mid + 1, end);
    merge(a, start, end, mid);
  }
}

int main() {
  int i, size, start = 0, end = 0, flag = 1;
  cin >> size;
  int a[size];

  for (i = 0; i < size; i++) {
    cin >> a[i];
  }

  end = size - 1;
  if (start < end) {
    mergeSort(a, start, end);
  } else {
    cout << a[start];
    flag = 0;
  }

  if (flag == 1) {
    for (i = 0; i < size; i++) {
      cout << a[i] << " ";
    }
  }
}

