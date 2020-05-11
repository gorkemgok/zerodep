package dev.ggok.zerodep.constant;

import static dev.ggok.zerodep.internal.Constants.PRIVATE_CONSTRUCTOR_MSG;

public final class DataSizeConstants {

    public static final long B_FACTOR = 1024;

    public static final long Bi_FACTOR = 1000;

    public static final long BYTE_TO_BIT = 8;

    public static final long BIT_TO_BYTE = 1 / BYTE_TO_BIT;

    public static final long KB_TO_BYTE = B_FACTOR;
    public static final long KB_TO_BIT = KB_TO_BYTE * BYTE_TO_BIT;

    public static final long BYTE_TO_KB = 1 / KB_TO_BYTE;
    public static final long BIT_TO_KB = 1 / KB_TO_BIT;

    public static final long MB_TO_KB = B_FACTOR;
    public static final long MB_TO_BYTE = MB_TO_KB * KB_TO_BYTE;
    public static final long MB_TO_BIT = MB_TO_BYTE * BYTE_TO_BIT;

    public static final long KB_TO_MB = 1 / MB_TO_KB;
    public static final long BYTE_TO_MB = 1 / MB_TO_BYTE;
    public static final long BIT_TO_MB = 1 / MB_TO_BIT;

    public static final long GB_TO_MB = B_FACTOR;
    public static final long GB_TO_KB = GB_TO_MB * MB_TO_KB;
    public static final long GB_TO_BYTE = GB_TO_KB * KB_TO_BYTE;
    public static final long GB_TO_BIT = GB_TO_BYTE * BYTE_TO_BIT;

    public static final long MB_TO_GB = 1 / GB_TO_MB;
    public static final long KB_TO_GB = 1 / GB_TO_KB;
    public static final long BYTE_TO_GB = 1 / GB_TO_BYTE;
    public static final long BIT_TO_GB = 1 / GB_TO_BIT;

    public static final long TB_TO_GB = B_FACTOR;
    public static final long TB_TO_MB = TB_TO_GB * GB_TO_MB;
    public static final long TB_TO_KB = TB_TO_MB * MB_TO_KB;
    public static final long TB_TO_BYTE = TB_TO_KB * KB_TO_BYTE;
    public static final long TB_TO_BIT = TB_TO_BYTE * BYTE_TO_BIT;

    public static final long GB_TO_TB = 1 / TB_TO_GB;
    public static final long MB_TO_TB = 1 / TB_TO_MB;
    public static final long KB_TO_TB = 1 / TB_TO_KB;
    public static final long BYTE_TO_TB = 1 / TB_TO_BYTE;
    public static final long BIT_TO_TB = 1 / TB_TO_BIT;

    public static final long PB_TO_TB = B_FACTOR;
    public static final long PB_TO_GB = PB_TO_TB * TB_TO_GB;
    public static final long PB_TO_MB = PB_TO_GB * GB_TO_MB;
    public static final long PB_TO_KB = PB_TO_MB * MB_TO_KB;
    public static final long PB_TO_BYTE = PB_TO_KB * KB_TO_BYTE;
    public static final long PB_TO_BIT = PB_TO_BYTE * BYTE_TO_BIT;

    public static final long TB_TO_PB = 1 / PB_TO_TB;
    public static final long GB_TO_PB = 1 / PB_TO_GB;
    public static final long MB_TO_PB = 1 / PB_TO_MB;
    public static final long KB_TO_PB = 1 / PB_TO_KB;
    public static final long BYTE_TO_PB = 1 / PB_TO_BYTE;
    public static final long BIT_TO_PB = 1 / PB_TO_BIT;

    public static final long Kbi_TO_BYTE = Bi_FACTOR;
    public static final long Kbi_TO_BIT = Kbi_TO_BYTE * BYTE_TO_BIT;

    public static final long BYTE_TO_Kbi = 1 / Kbi_TO_BYTE;
    public static final long BIT_TO_Kbi = 1 / Kbi_TO_BIT;

    public static final long Mbi_TO_Kbi = Bi_FACTOR;
    public static final long Mbi_TO_BYTE = Mbi_TO_Kbi * Kbi_TO_BYTE;
    public static final long Mbi_TO_BIT = Mbi_TO_BYTE * BYTE_TO_BIT;

    public static final long Kbi_TO_Mbi = 1 / Mbi_TO_Kbi;
    public static final long BYTE_TO_Mbi = 1 / Mbi_TO_BYTE;
    public static final long BIT_TO_Mbi = 1 / Mbi_TO_BIT;

    public static final long Gbi_TO_Mbi = Bi_FACTOR;
    public static final long Gbi_TO_Kbi = Gbi_TO_Mbi * Mbi_TO_Kbi;
    public static final long Gbi_TO_BYTE = Gbi_TO_Kbi * Kbi_TO_BYTE;
    public static final long Gbi_TO_BIT = Gbi_TO_BYTE * BYTE_TO_BIT;

    public static final long Mbi_TO_Gbi = 1 / Gbi_TO_Mbi;
    public static final long Kbi_TO_Gbi = 1 / Gbi_TO_Kbi;
    public static final long BYTE_TO_Gbi = 1 / Gbi_TO_BYTE;
    public static final long BIT_TO_Gbi = 1 / Gbi_TO_BIT;

    public static final long Tbi_TO_Gbi = Bi_FACTOR;
    public static final long Tbi_TO_Mbi = Tbi_TO_Gbi * Gbi_TO_Mbi;
    public static final long Tbi_TO_Kbi = Tbi_TO_Mbi * Mbi_TO_Kbi;
    public static final long Tbi_TO_BYTE = Tbi_TO_Kbi * Kbi_TO_BYTE;
    public static final long Tbi_TO_BIT = Tbi_TO_BYTE * BYTE_TO_BIT;

    public static final long Gbi_TO_Tbi = 1 / Tbi_TO_Gbi;
    public static final long Mbi_TO_Tbi = 1 / Tbi_TO_Mbi;
    public static final long Kbi_TO_Tbi = 1 / Tbi_TO_Kbi;
    public static final long BYTE_TO_Tbi = 1 / Tbi_TO_BYTE;
    public static final long BIT_TO_Tbi = 1 / Tbi_TO_BIT;

    public static final long Pbi_TO_Tbi = Bi_FACTOR;
    public static final long Pbi_TO_Gbi = Pbi_TO_Tbi * Tbi_TO_Gbi;
    public static final long Pbi_TO_Mbi = Pbi_TO_Gbi * Gbi_TO_Mbi;
    public static final long Pbi_TO_Kbi = Pbi_TO_Mbi * Mbi_TO_Kbi;
    public static final long Pbi_TO_BYTE = Pbi_TO_Kbi * Kbi_TO_BYTE;
    public static final long Pbi_TO_BIT = Pbi_TO_BYTE * BYTE_TO_BIT;

    public static final long Tbi_TO_Pbi = 1 / Pbi_TO_Tbi;
    public static final long Gbi_TO_Pbi = 1 / Pbi_TO_Gbi;
    public static final long Mbi_TO_Pbi = 1 / Pbi_TO_Mbi;
    public static final long Kbi_TO_Pbi = 1 / Pbi_TO_Kbi;
    public static final long BYTE_TO_Pbi = 1 / Pbi_TO_BYTE;
    public static final long BIT_TO_Pbi = 1 / Pbi_TO_BIT;

    public static final long Kbi_TO_KB = Kbi_TO_BIT * BIT_TO_KB;
    public static final long KB_TO_Kbi = KB_TO_BIT * BIT_TO_Kbi;

    public static final long Mbi_TO_MB = Mbi_TO_BIT * BIT_TO_MB;
    public static final long MB_TO_Mbi = MB_TO_BIT * BIT_TO_Mbi;

    public static final long Gbi_TO_GB = Gbi_TO_BIT * BIT_TO_GB;
    public static final long GB_TO_Gbi = GB_TO_BIT * BIT_TO_Gbi;

    public static final long Tbi_TO_TB = Tbi_TO_BIT * BIT_TO_TB;
    public static final long TB_TO_Tbi = TB_TO_BIT * BIT_TO_Tbi;

    public static final long Pbi_TO_PB = Pbi_TO_BIT * BIT_TO_PB;
    public static final long PB_TO_Pbi = PB_TO_BIT * BIT_TO_Pbi;

    private DataSizeConstants() {
        throw new UnsupportedOperationException(PRIVATE_CONSTRUCTOR_MSG);
    }
}
