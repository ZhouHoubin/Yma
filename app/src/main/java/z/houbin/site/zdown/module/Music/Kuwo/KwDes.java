package z.houbin.site.zdown.module.Music.Kuwo;

import android.util.Xml;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.Arrays;

public class KwDes {

    private static long[] _arrayMask = new long[]
            {
                    1,
                    2,
                    4,
                    8,
                    16,
                    32,
                    64,
                    128,
                    256,
                    512,
                    1024,
                    2048,
                    4096,
                    8192,
                    16384,
                    32768,
                    65536,
                    131072,
                    262144,
                    524288,
                    1048576,
                    2097152,
                    4194304,
                    8388608,
                    16777216,
                    33554432,
                    67108864,
                    134217728,
                    268435456,
                    536870912,
                    1073741824,
                    2147483648L,
                    4294967296L,
                    8589934592L,
                    17179869184L,
                    34359738368L,
                    68719476736L,
                    137438953472L,
                    274877906944L,
                    549755813888L,
                    1099511627776L,
                    2199023255552L,
                    4398046511104L,
                    8796093022208L,
                    17592186044416L,
                    35184372088832L,
                    70368744177664L,
                    140737488355328L,
                    281474976710656L,
                    562949953421312L,
                    1125899906842624L,
                    2251799813685248L,
                    4503599627370496L,
                    9007199254740992L,
                    18014398509481984L,
                    36028797018963968L,
                    72057594037927936L,
                    144115188075855872L,
                    288230376151711744L,
                    576460752303423488L,
                    1152921504606846976L,
                    2305843009213693952L,
                    4611686018427387904L,
                    new BigInteger("9223372036854775808").longValue()
            };

    private static int[] _arrayIP = new int[]
            {
                    57,
                    49,
                    41,
                    33,
                    25,
                    17,
                    9,
                    1,
                    59,
                    51,
                    43,
                    35,
                    27,
                    19,
                    11,
                    3,
                    61,
                    53,
                    45,
                    37,
                    29,
                    21,
                    13,
                    5,
                    63,
                    55,
                    47,
                    39,
                    31,
                    23,
                    15,
                    7,
                    56,
                    48,
                    40,
                    32,
                    24,
                    16,
                    8,
                    0,
                    58,
                    50,
                    42,
                    34,
                    26,
                    18,
                    10,
                    2,
                    60,
                    52,
                    44,
                    36,
                    28,
                    20,
                    12,
                    4,
                    62,
                    54,
                    46,
                    38,
                    30,
                    22,
                    14,
                    6
            };

    private static int[] _arrayE = new int[]
            {
                    31,
                    0,
                    1,
                    2,
                    3,
                    4,
                    -1,
                    -1,
                    3,
                    4,
                    5,
                    6,
                    7,
                    8,
                    -1,
                    -1,
                    7,
                    8,
                    9,
                    10,
                    11,
                    12,
                    -1,
                    -1,
                    11,
                    12,
                    13,
                    14,
                    15,
                    16,
                    -1,
                    -1,
                    15,
                    16,
                    17,
                    18,
                    19,
                    20,
                    -1,
                    -1,
                    19,
                    20,
                    21,
                    22,
                    23,
                    24,
                    -1,
                    -1,
                    23,
                    24,
                    25,
                    26,
                    27,
                    28,
                    -1,
                    -1,
                    27,
                    28,
                    29,
                    30,
                    31,
                    30,
                    -1,
                    -1
            };

    private static
    byte[][] _matrixNSBox = new byte[][]
            {
                    new byte[]
                            {
                                    14,
                                    4,
                                    3,
                                    15,
                                    2,
                                    13,
                                    5,
                                    3,
                                    13,
                                    14,
                                    6,
                                    9,
                                    11,
                                    2,
                                    0,
                                    5,
                                    4,
                                    1,
                                    10,
                                    12,
                                    15,
                                    6,
                                    9,
                                    10,
                                    1,
                                    8,
                                    12,
                                    7,
                                    8,
                                    11,
                                    7,
                                    0,
                                    0,
                                    15,
                                    10,
                                    5,
                                    14,
                                    4,
                                    9,
                                    10,
                                    7,
                                    8,
                                    12,
                                    3,
                                    13,
                                    1,
                                    3,
                                    6,
                                    15,
                                    12,
                                    6,
                                    11,
                                    2,
                                    9,
                                    5,
                                    0,
                                    4,
                                    2,
                                    11,
                                    14,
                                    1,
                                    7,
                                    8,
                                    13
                            },
                    new byte[]
                            {
                                    15,
                                    0,
                                    9,
                                    5,
                                    6,
                                    10,
                                    12,
                                    9,
                                    8,
                                    7,
                                    2,
                                    12,
                                    3,
                                    13,
                                    5,
                                    2,
                                    1,
                                    14,
                                    7,
                                    8,
                                    11,
                                    4,
                                    0,
                                    3,
                                    14,
                                    11,
                                    13,
                                    6,
                                    4,
                                    1,
                                    10,
                                    15,
                                    3,
                                    13,
                                    12,
                                    11,
                                    15,
                                    3,
                                    6,
                                    0,
                                    4,
                                    10,
                                    1,
                                    7,
                                    8,
                                    4,
                                    11,
                                    14,
                                    13,
                                    8,
                                    0,
                                    6,
                                    2,
                                    15,
                                    9,
                                    5,
                                    7,
                                    1,
                                    10,
                                    12,
                                    14,
                                    2,
                                    5,
                                    9
                            },
                    new byte[]
                            {
                                    10,
                                    13,
                                    1,
                                    11,
                                    6,
                                    8,
                                    11,
                                    5,
                                    9,
                                    4,
                                    12,
                                    2,
                                    15,
                                    3,
                                    2,
                                    14,
                                    0,
                                    6,
                                    13,
                                    1,
                                    3,
                                    15,
                                    4,
                                    10,
                                    14,
                                    9,
                                    7,
                                    12,
                                    5,
                                    0,
                                    8,
                                    7,
                                    13,
                                    1,
                                    2,
                                    4,
                                    3,
                                    6,
                                    12,
                                    11,
                                    0,
                                    13,
                                    5,
                                    14,
                                    6,
                                    8,
                                    15,
                                    2,
                                    7,
                                    10,
                                    8,
                                    15,
                                    4,
                                    9,
                                    11,
                                    5,
                                    9,
                                    0,
                                    14,
                                    3,
                                    10,
                                    7,
                                    1,
                                    12
                            },
                    new byte[]
                            {
                                    7,
                                    10,
                                    1,
                                    15,
                                    0,
                                    12,
                                    11,
                                    5,
                                    14,
                                    9,
                                    8,
                                    3,
                                    9,
                                    7,
                                    4,
                                    8,
                                    13,
                                    6,
                                    2,
                                    1,
                                    6,
                                    11,
                                    12,
                                    2,
                                    3,
                                    0,
                                    5,
                                    14,
                                    10,
                                    13,
                                    15,
                                    4,
                                    13,
                                    3,
                                    4,
                                    9,
                                    6,
                                    10,
                                    1,
                                    12,
                                    11,
                                    0,
                                    2,
                                    5,
                                    0,
                                    13,
                                    14,
                                    2,
                                    8,
                                    15,
                                    7,
                                    4,
                                    15,
                                    1,
                                    10,
                                    7,
                                    5,
                                    6,
                                    12,
                                    11,
                                    3,
                                    8,
                                    9,
                                    14
                            },
                    new byte[]
                            {
                                    2,
                                    4,
                                    8,
                                    15,
                                    7,
                                    10,
                                    13,
                                    6,
                                    4,
                                    1,
                                    3,
                                    12,
                                    11,
                                    7,
                                    14,
                                    0,
                                    12,
                                    2,
                                    5,
                                    9,
                                    10,
                                    13,
                                    0,
                                    3,
                                    1,
                                    11,
                                    15,
                                    5,
                                    6,
                                    8,
                                    9,
                                    14,
                                    14,
                                    11,
                                    5,
                                    6,
                                    4,
                                    1,
                                    3,
                                    10,
                                    2,
                                    12,
                                    15,
                                    0,
                                    13,
                                    2,
                                    8,
                                    5,
                                    11,
                                    8,
                                    0,
                                    15,
                                    7,
                                    14,
                                    9,
                                    4,
                                    12,
                                    7,
                                    10,
                                    9,
                                    1,
                                    13,
                                    6,
                                    3
                            },
                    new byte[]
                            {
                                    12,
                                    9,
                                    0,
                                    7,
                                    9,
                                    2,
                                    14,
                                    1,
                                    10,
                                    15,
                                    3,
                                    4,
                                    6,
                                    12,
                                    5,
                                    11,
                                    1,
                                    14,
                                    13,
                                    0,
                                    2,
                                    8,
                                    7,
                                    13,
                                    15,
                                    5,
                                    4,
                                    10,
                                    8,
                                    3,
                                    11,
                                    6,
                                    10,
                                    4,
                                    6,
                                    11,
                                    7,
                                    9,
                                    0,
                                    6,
                                    4,
                                    2,
                                    13,
                                    1,
                                    9,
                                    15,
                                    3,
                                    8,
                                    15,
                                    3,
                                    1,
                                    14,
                                    12,
                                    5,
                                    11,
                                    0,
                                    2,
                                    12,
                                    14,
                                    7,
                                    5,
                                    10,
                                    8,
                                    13
                            },
                    new byte[]
                            {
                                    4,
                                    1,
                                    3,
                                    10,
                                    15,
                                    12,
                                    5,
                                    0,
                                    2,
                                    11,
                                    9,
                                    6,
                                    8,
                                    7,
                                    6,
                                    9,
                                    11,
                                    4,
                                    12,
                                    15,
                                    0,
                                    3,
                                    10,
                                    5,
                                    14,
                                    13,
                                    7,
                                    8,
                                    13,
                                    14,
                                    1,
                                    2,
                                    13,
                                    6,
                                    14,
                                    9,
                                    4,
                                    1,
                                    2,
                                    14,
                                    11,
                                    13,
                                    5,
                                    0,
                                    1,
                                    10,
                                    8,
                                    3,
                                    0,
                                    11,
                                    3,
                                    5,
                                    9,
                                    4,
                                    15,
                                    2,
                                    7,
                                    8,
                                    12,
                                    15,
                                    10,
                                    7,
                                    6,
                                    12
                            },
                    new byte[]
                            {
                                    13,
                                    7,
                                    10,
                                    0,
                                    6,
                                    9,
                                    5,
                                    15,
                                    8,
                                    4,
                                    3,
                                    10,
                                    11,
                                    14,
                                    12,
                                    5,
                                    2,
                                    11,
                                    9,
                                    6,
                                    15,
                                    12,
                                    0,
                                    3,
                                    4,
                                    1,
                                    14,
                                    13,
                                    1,
                                    2,
                                    7,
                                    8,
                                    1,
                                    2,
                                    12,
                                    15,
                                    10,
                                    4,
                                    0,
                                    3,
                                    13,
                                    14,
                                    6,
                                    9,
                                    7,
                                    8,
                                    9,
                                    6,
                                    15,
                                    1,
                                    5,
                                    12,
                                    3,
                                    10,
                                    14,
                                    5,
                                    8,
                                    7,
                                    11,
                                    0,
                                    4,
                                    13,
                                    2,
                                    11
                            }
            };

    private static int[] _arrayP = new int[]
            {
                    15,
                    6,
                    19,
                    20,
                    28,
                    11,
                    27,
                    16,
                    0,
                    14,
                    22,
                    25,
                    4,
                    17,
                    30,
                    9,
                    1,
                    7,
                    23,
                    13,
                    31,
                    26,
                    2,
                    8,
                    18,
                    12,
                    29,
                    5,
                    21,
                    10,
                    3,
                    24
            };

    private static int[] _arrayIP_1 = new int[]
            {
                    39,
                    7,
                    47,
                    15,
                    55,
                    23,
                    63,
                    31,
                    38,
                    6,
                    46,
                    14,
                    54,
                    22,
                    62,
                    30,
                    37,
                    5,
                    45,
                    13,
                    53,
                    21,
                    61,
                    29,
                    36,
                    4,
                    44,
                    12,
                    52,
                    20,
                    60,
                    28,
                    35,
                    3,
                    43,
                    11,
                    51,
                    19,
                    59,
                    27,
                    34,
                    2,
                    42,
                    10,
                    50,
                    18,
                    58,
                    26,
                    33,
                    1,
                    41,
                    9,
                    49,
                    17,
                    57,
                    25,
                    32,
                    0,
                    40,
                    8,
                    48,
                    16,
                    56,
                    24
            };

    private static int[] _arrayPC_1 = new int[]
            {
                    56,
                    48,
                    40,
                    32,
                    24,
                    16,
                    8,
                    0,
                    57,
                    49,
                    41,
                    33,
                    25,
                    17,
                    9,
                    1,
                    58,
                    50,
                    42,
                    34,
                    26,
                    18,
                    10,
                    2,
                    59,
                    51,
                    43,
                    35,
                    62,
                    54,
                    46,
                    38,
                    30,
                    22,
                    14,
                    6,
                    61,
                    53,
                    45,
                    37,
                    29,
                    21,
                    13,
                    5,
                    60,
                    52,
                    44,
                    36,
                    28,
                    20,
                    12,
                    4,
                    27,
                    19,
                    11,
                    3
            };

    private static int[] _arrayPC_2 = new int[]
            {
                    13,
                    16,
                    10,
                    23,
                    0,
                    4,
                    -1,
                    -1,
                    2,
                    27,
                    14,
                    5,
                    20,
                    9,
                    -1,
                    -1,
                    22,
                    18,
                    11,
                    3,
                    25,
                    7,
                    -1,
                    -1,
                    15,
                    6,
                    26,
                    19,
                    12,
                    1,
                    -1,
                    -1,
                    40,
                    51,
                    30,
                    36,
                    46,
                    54,
                    -1,
                    -1,
                    29,
                    39,
                    50,
                    44,
                    32,
                    47,
                    -1,
                    -1,
                    43,
                    48,
                    38,
                    55,
                    33,
                    52,
                    -1,
                    -1,
                    45,
                    41,
                    49,
                    35,
                    28,
                    31,
                    -1,
                    -1
            };

    private static int[] _arrayLs = new int[]
            {
                    1,
                    1,
                    2,
                    2,
                    2,
                    2,
                    2,
                    2,
                    1,
                    2,
                    2,
                    2,
                    2,
                    2,
                    2,
                    1
            };

    private static long[] _arrayLsMask = new long[]{0,1048577, 3145731};

    private static Object LockObj = new Object();

    private static int DES_MODE_ENCRYPT = 0;

    private static int DES_MODE_DECRYPT = 1;

    private static long L;

    private static long R;

    private static int[] pSource = new int[2];

    private static byte[] pR = new byte[8];

    private static int SOut;

    private static int t;

    private static int sbi;

    private static long BitTransform(int[] array, int len, long source) {
        int num = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] >= 0 && (source & _arrayMask[array[i]]) != 0) {
                num |= _arrayMask[i];
            }
        }
        return num;
    }

    private static void DESSubKeys(long key, long[] K, int mode) {
        long num = BitTransform(_arrayPC_1, 56, key);
        for (int i = 0; i < 16; i++) {
            long num2 = num;
            num = ((num2 & _arrayLsMask[_arrayLs[i]]) << 28 - _arrayLs[i] | (num2 & ~_arrayLsMask[_arrayLs[i]]) >> _arrayLs[i]);
            K[i] = BitTransform(_arrayPC_2, 64, num);
        }
        if (mode == DES_MODE_DECRYPT) {
            for (int i = 0; i < 8; i++) {
                long num3 = K[i];
                K[i] = K[15 - i];
                K[15 - i] = num3;
            }
        }
    }

    private static int GetHigher32Bit(long ori) {
        return (int) (ori >> 32 & ((long) ((long) -1)));
    }

    private static long Des64(long[] subkeys, long data) {
        long num = BitTransform(_arrayIP, 64, data);
        pSource[0] = (int) (num & (((long) -1)));
        BigInteger bigInteger1 = new BigInteger("18446744069414584320");
        pSource[1] = (int) ((num & bigInteger1.longValue()) >> 32);
        for (int i = 0; i < 16; i++) {
            R = (long) pSource[1];
            R = BitTransform(_arrayE, 64, R);
            R ^= subkeys[i];
            for (int j = 0; j < 8; j++) {
                pR[j] = (byte) (255 & R >> j * 8);
            }
            SOut = 0;
            sbi = 7;
            while (sbi >= 0) {
                SOut <<= 4;
                SOut |= (int) _matrixNSBox[sbi][(int) pR[sbi]];
                sbi--;
            }
            R = (long) SOut;
            R = BitTransform(_arrayP, 32, R);
            L = (long) pSource[0];
            pSource[0] = pSource[1];
            pSource[1] = (int) (L ^ R);
        }
        t = pSource[0];
        pSource[0] = pSource[1];
        pSource[1] = t;
        BigInteger bigInteger = new BigInteger("18446744069414584320");
        num = (((long) pSource[1] << 32 & bigInteger.longValue()) |
                (((long) -1) & (long) pSource[0]));
        return BitTransform(_arrayIP_1, 64, num);
    }

    public static byte[] Encrypt(byte[] src, int srcLength, byte[] key, int keyLength) {
        byte[] result;
        synchronized (LockObj) {
            int num = 0;
            for (int i = 0; i < 8; i++) {
                long num2 = (long) key[i] << i * 8;
                num |= num2;
            }
            int num3 = srcLength / 8;
            long[] array = new long[16];
            for (int j = 0; j < 16; j++) {
                array[j] = 0;
            }
            long[] array2 = new long[num3];
            for (int k = 0; k < num3; k++) {
                for (int l = 0; l < 8; l++) {
                    array2[k] |= (long) src[k * 8 + l] << l * 8;
                }
            }
            long[] array3 = new long[((num3 + 1) * 8 + 1) / 8];
            DESSubKeys(num, array, DES_MODE_ENCRYPT);
            for (int m = 0; m < num3; m++) {
                array3[m] = Des64(array, array2[m]);
            }
            int num4 = srcLength % 8;
            byte[] array4 = new byte[srcLength - num3 * 8];
            System.arraycopy(src, num3 * 8, array4, 0, srcLength - num3 * 8);
            int num5 = 0;
            for (int n = 0; n < num4; n++) {
                num5 |= (long) array4[n] << n * 8;
            }
            array3[num3] = Des64(array, num5);
            byte[] array5 = new byte[array3.length * 8];
            int num6 = 0;
            for (int num7 = 0; num7 < array3.length; num7++) {
                for (int num8 = 0; num8 < 8; num8++) {
                    array5[num6] = (byte) (255 & array3[num7] >> num8 * 8);
                    num6++;
                }
            }
            result = array5;
        }
        return result;
    }

    public static byte[] EncryptToBytes(String src, String key) {
        byte[] bytes = new byte[0];
        try {
            bytes = src.getBytes("utf8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte[] bytes2 = new byte[0];
        try {
            bytes2 = key.getBytes("utf8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return Encrypt(bytes, bytes.length, bytes2, bytes2.length);
    }

    public static String Encrypt(String src, String key) {
        byte[] bytes = src.getBytes();
        byte[] bytes2 = key.getBytes();
        byte[] array = Encrypt(bytes, bytes.length, bytes2, bytes2.length);
        return new String(array, 0, array.length);
    }
}
