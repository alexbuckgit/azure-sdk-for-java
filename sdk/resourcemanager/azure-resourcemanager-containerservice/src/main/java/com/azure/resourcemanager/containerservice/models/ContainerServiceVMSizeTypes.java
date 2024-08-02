// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Size of agent VMs. Note: This is no longer maintained. */
public final class ContainerServiceVMSizeTypes extends ExpandableStringEnum<ContainerServiceVMSizeTypes> {
    /** Static value Standard_A1 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A1 = fromString("Standard_A1");

    /** Static value Standard_A10 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A10 = fromString("Standard_A10");

    /** Static value Standard_A11 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A11 = fromString("Standard_A11");

    /** Static value Standard_A1_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A1_V2 = fromString("Standard_A1_v2");

    /** Static value Standard_A2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A2 = fromString("Standard_A2");

    /** Static value Standard_A2_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A2_V2 = fromString("Standard_A2_v2");

    /** Static value Standard_A2m_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A2M_V2 = fromString("Standard_A2m_v2");

    /** Static value Standard_A3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A3 = fromString("Standard_A3");

    /** Static value Standard_A4 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A4 = fromString("Standard_A4");

    /** Static value Standard_A4_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A4_V2 = fromString("Standard_A4_v2");

    /** Static value Standard_A4m_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A4M_V2 = fromString("Standard_A4m_v2");

    /** Static value Standard_A5 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A5 = fromString("Standard_A5");

    /** Static value Standard_A6 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A6 = fromString("Standard_A6");

    /** Static value Standard_A7 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A7 = fromString("Standard_A7");

    /** Static value Standard_A8 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A8 = fromString("Standard_A8");

    /** Static value Standard_A8_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A8_V2 = fromString("Standard_A8_v2");

    /** Static value Standard_A8m_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A8M_V2 = fromString("Standard_A8m_v2");

    /** Static value Standard_A9 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_A9 = fromString("Standard_A9");

    /** Static value Standard_B2ms for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_B2MS = fromString("Standard_B2ms");

    /** Static value Standard_B2s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_B2S = fromString("Standard_B2s");

    /** Static value Standard_B4ms for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_B4MS = fromString("Standard_B4ms");

    /** Static value Standard_B8ms for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_B8MS = fromString("Standard_B8ms");

    /** Static value Standard_D1 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D1 = fromString("Standard_D1");

    /** Static value Standard_D11 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D11 = fromString("Standard_D11");

    /** Static value Standard_D11_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D11_V2 = fromString("Standard_D11_v2");

    /** Static value Standard_D11_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D11_V2_PROMO = fromString("Standard_D11_v2_Promo");

    /** Static value Standard_D12 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D12 = fromString("Standard_D12");

    /** Static value Standard_D12_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D12_V2 = fromString("Standard_D12_v2");

    /** Static value Standard_D12_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D12_V2_PROMO = fromString("Standard_D12_v2_Promo");

    /** Static value Standard_D13 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D13 = fromString("Standard_D13");

    /** Static value Standard_D13_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D13_V2 = fromString("Standard_D13_v2");

    /** Static value Standard_D13_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D13_V2_PROMO = fromString("Standard_D13_v2_Promo");

    /** Static value Standard_D14 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D14 = fromString("Standard_D14");

    /** Static value Standard_D14_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D14_V2 = fromString("Standard_D14_v2");

    /** Static value Standard_D14_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D14_V2_PROMO = fromString("Standard_D14_v2_Promo");

    /** Static value Standard_D15_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D15_V2 = fromString("Standard_D15_v2");

    /** Static value Standard_D16_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D16_V3 = fromString("Standard_D16_v3");

    /** Static value Standard_D16s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D16S_V3 = fromString("Standard_D16s_v3");

    /** Static value Standard_D1_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D1_V2 = fromString("Standard_D1_v2");

    /** Static value Standard_D2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D2 = fromString("Standard_D2");

    /** Static value Standard_D2_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D2_V2 = fromString("Standard_D2_v2");

    /** Static value Standard_D2_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D2_V2_PROMO = fromString("Standard_D2_v2_Promo");

    /** Static value Standard_D2_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D2_V3 = fromString("Standard_D2_v3");

    /** Static value Standard_D2s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D2S_V3 = fromString("Standard_D2s_v3");

    /** Static value Standard_D3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D3 = fromString("Standard_D3");

    /** Static value Standard_D32_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D32_V3 = fromString("Standard_D32_v3");

    /** Static value Standard_D32s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D32S_V3 = fromString("Standard_D32s_v3");

    /** Static value Standard_D3_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D3_V2 = fromString("Standard_D3_v2");

    /** Static value Standard_D3_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D3_V2_PROMO = fromString("Standard_D3_v2_Promo");

    /** Static value Standard_D4 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D4 = fromString("Standard_D4");

    /** Static value Standard_D4_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D4_V2 = fromString("Standard_D4_v2");

    /** Static value Standard_D4_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D4_V2_PROMO = fromString("Standard_D4_v2_Promo");

    /** Static value Standard_D4_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D4_V3 = fromString("Standard_D4_v3");

    /** Static value Standard_D4s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D4S_V3 = fromString("Standard_D4s_v3");

    /** Static value Standard_D5_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D5_V2 = fromString("Standard_D5_v2");

    /** Static value Standard_D5_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D5_V2_PROMO = fromString("Standard_D5_v2_Promo");

    /** Static value Standard_D64_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D64_V3 = fromString("Standard_D64_v3");

    /** Static value Standard_D64s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D64S_V3 = fromString("Standard_D64s_v3");

    /** Static value Standard_D8_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D8_V3 = fromString("Standard_D8_v3");

    /** Static value Standard_D8s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_D8S_V3 = fromString("Standard_D8s_v3");

    /** Static value Standard_DS1 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS1 = fromString("Standard_DS1");

    /** Static value Standard_DS11 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS11 = fromString("Standard_DS11");

    /** Static value Standard_DS11_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS11_V2 = fromString("Standard_DS11_v2");

    /** Static value Standard_DS11_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS11_V2_PROMO = fromString("Standard_DS11_v2_Promo");

    /** Static value Standard_DS12 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS12 = fromString("Standard_DS12");

    /** Static value Standard_DS12_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS12_V2 = fromString("Standard_DS12_v2");

    /** Static value Standard_DS12_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS12_V2_PROMO = fromString("Standard_DS12_v2_Promo");

    /** Static value Standard_DS13 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS13 = fromString("Standard_DS13");

    /** Static value Standard_DS13-2_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS13_2_V2 = fromString("Standard_DS13-2_v2");

    /** Static value Standard_DS13-4_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS13_4_V2 = fromString("Standard_DS13-4_v2");

    /** Static value Standard_DS13_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS13_V2 = fromString("Standard_DS13_v2");

    /** Static value Standard_DS13_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS13_V2_PROMO = fromString("Standard_DS13_v2_Promo");

    /** Static value Standard_DS14 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS14 = fromString("Standard_DS14");

    /** Static value Standard_DS14-4_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS14_4_V2 = fromString("Standard_DS14-4_v2");

    /** Static value Standard_DS14-8_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS14_8_V2 = fromString("Standard_DS14-8_v2");

    /** Static value Standard_DS14_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS14_V2 = fromString("Standard_DS14_v2");

    /** Static value Standard_DS14_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS14_V2_PROMO = fromString("Standard_DS14_v2_Promo");

    /** Static value Standard_DS15_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS15_V2 = fromString("Standard_DS15_v2");

    /** Static value Standard_DS1_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS1_V2 = fromString("Standard_DS1_v2");

    /** Static value Standard_DS2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS2 = fromString("Standard_DS2");

    /** Static value Standard_DS2_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS2_V2 = fromString("Standard_DS2_v2");

    /** Static value Standard_DS2_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS2_V2_PROMO = fromString("Standard_DS2_v2_Promo");

    /** Static value Standard_DS3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS3 = fromString("Standard_DS3");

    /** Static value Standard_DS3_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS3_V2 = fromString("Standard_DS3_v2");

    /** Static value Standard_DS3_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS3_V2_PROMO = fromString("Standard_DS3_v2_Promo");

    /** Static value Standard_DS4 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS4 = fromString("Standard_DS4");

    /** Static value Standard_DS4_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS4_V2 = fromString("Standard_DS4_v2");

    /** Static value Standard_DS4_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS4_V2_PROMO = fromString("Standard_DS4_v2_Promo");

    /** Static value Standard_DS5_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS5_V2 = fromString("Standard_DS5_v2");

    /** Static value Standard_DS5_v2_Promo for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_DS5_V2_PROMO = fromString("Standard_DS5_v2_Promo");

    /** Static value Standard_E16_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E16_V3 = fromString("Standard_E16_v3");

    /** Static value Standard_E16s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E16S_V3 = fromString("Standard_E16s_v3");

    /** Static value Standard_E2_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E2_V3 = fromString("Standard_E2_v3");

    /** Static value Standard_E2s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E2S_V3 = fromString("Standard_E2s_v3");

    /** Static value Standard_E32-16s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E32_16S_V3 = fromString("Standard_E32-16s_v3");

    /** Static value Standard_E32-8s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E32_8S_V3 = fromString("Standard_E32-8s_v3");

    /** Static value Standard_E32_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E32_V3 = fromString("Standard_E32_v3");

    /** Static value Standard_E32s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E32S_V3 = fromString("Standard_E32s_v3");

    /** Static value Standard_E4_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E4_V3 = fromString("Standard_E4_v3");

    /** Static value Standard_E4s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E4S_V3 = fromString("Standard_E4s_v3");

    /** Static value Standard_E64-16s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E64_16S_V3 = fromString("Standard_E64-16s_v3");

    /** Static value Standard_E64-32s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E64_32S_V3 = fromString("Standard_E64-32s_v3");

    /** Static value Standard_E64_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E64_V3 = fromString("Standard_E64_v3");

    /** Static value Standard_E64s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E64S_V3 = fromString("Standard_E64s_v3");

    /** Static value Standard_E8_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E8_V3 = fromString("Standard_E8_v3");

    /** Static value Standard_E8s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_E8S_V3 = fromString("Standard_E8s_v3");

    /** Static value Standard_F1 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F1 = fromString("Standard_F1");

    /** Static value Standard_F16 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F16 = fromString("Standard_F16");

    /** Static value Standard_F16s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F16S = fromString("Standard_F16s");

    /** Static value Standard_F16s_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F16S_V2 = fromString("Standard_F16s_v2");

    /** Static value Standard_F1s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F1S = fromString("Standard_F1s");

    /** Static value Standard_F2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F2 = fromString("Standard_F2");

    /** Static value Standard_F2s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F2S = fromString("Standard_F2s");

    /** Static value Standard_F2s_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F2S_V2 = fromString("Standard_F2s_v2");

    /** Static value Standard_F32s_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F32S_V2 = fromString("Standard_F32s_v2");

    /** Static value Standard_F4 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F4 = fromString("Standard_F4");

    /** Static value Standard_F4s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F4S = fromString("Standard_F4s");

    /** Static value Standard_F4s_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F4S_V2 = fromString("Standard_F4s_v2");

    /** Static value Standard_F64s_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F64S_V2 = fromString("Standard_F64s_v2");

    /** Static value Standard_F72s_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F72S_V2 = fromString("Standard_F72s_v2");

    /** Static value Standard_F8 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F8 = fromString("Standard_F8");

    /** Static value Standard_F8s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F8S = fromString("Standard_F8s");

    /** Static value Standard_F8s_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_F8S_V2 = fromString("Standard_F8s_v2");

    /** Static value Standard_G1 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_G1 = fromString("Standard_G1");

    /** Static value Standard_G2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_G2 = fromString("Standard_G2");

    /** Static value Standard_G3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_G3 = fromString("Standard_G3");

    /** Static value Standard_G4 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_G4 = fromString("Standard_G4");

    /** Static value Standard_G5 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_G5 = fromString("Standard_G5");

    /** Static value Standard_GS1 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_GS1 = fromString("Standard_GS1");

    /** Static value Standard_GS2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_GS2 = fromString("Standard_GS2");

    /** Static value Standard_GS3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_GS3 = fromString("Standard_GS3");

    /** Static value Standard_GS4 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_GS4 = fromString("Standard_GS4");

    /** Static value Standard_GS4-4 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_GS4_4 = fromString("Standard_GS4-4");

    /** Static value Standard_GS4-8 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_GS4_8 = fromString("Standard_GS4-8");

    /** Static value Standard_GS5 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_GS5 = fromString("Standard_GS5");

    /** Static value Standard_GS5-16 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_GS5_16 = fromString("Standard_GS5-16");

    /** Static value Standard_GS5-8 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_GS5_8 = fromString("Standard_GS5-8");

    /** Static value Standard_H16 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_H16 = fromString("Standard_H16");

    /** Static value Standard_H16m for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_H16M = fromString("Standard_H16m");

    /** Static value Standard_H16mr for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_H16MR = fromString("Standard_H16mr");

    /** Static value Standard_H16r for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_H16R = fromString("Standard_H16r");

    /** Static value Standard_H8 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_H8 = fromString("Standard_H8");

    /** Static value Standard_H8m for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_H8M = fromString("Standard_H8m");

    /** Static value Standard_L16s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_L16S = fromString("Standard_L16s");

    /** Static value Standard_L32s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_L32S = fromString("Standard_L32s");

    /** Static value Standard_L4s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_L4S = fromString("Standard_L4s");

    /** Static value Standard_L8s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_L8S = fromString("Standard_L8s");

    /** Static value Standard_M128-32ms for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_M128_32MS = fromString("Standard_M128-32ms");

    /** Static value Standard_M128-64ms for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_M128_64MS = fromString("Standard_M128-64ms");

    /** Static value Standard_M128ms for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_M128MS = fromString("Standard_M128ms");

    /** Static value Standard_M128s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_M128S = fromString("Standard_M128s");

    /** Static value Standard_M64-16ms for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_M64_16MS = fromString("Standard_M64-16ms");

    /** Static value Standard_M64-32ms for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_M64_32MS = fromString("Standard_M64-32ms");

    /** Static value Standard_M64ms for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_M64MS = fromString("Standard_M64ms");

    /** Static value Standard_M64s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_M64S = fromString("Standard_M64s");

    /** Static value Standard_NC12 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC12 = fromString("Standard_NC12");

    /** Static value Standard_NC12s_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC12S_V2 = fromString("Standard_NC12s_v2");

    /** Static value Standard_NC12s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC12S_V3 = fromString("Standard_NC12s_v3");

    /** Static value Standard_NC24 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC24 = fromString("Standard_NC24");

    /** Static value Standard_NC24r for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC24R = fromString("Standard_NC24r");

    /** Static value Standard_NC24rs_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC24RS_V2 = fromString("Standard_NC24rs_v2");

    /** Static value Standard_NC24rs_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC24RS_V3 = fromString("Standard_NC24rs_v3");

    /** Static value Standard_NC24s_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC24S_V2 = fromString("Standard_NC24s_v2");

    /** Static value Standard_NC24s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC24S_V3 = fromString("Standard_NC24s_v3");

    /** Static value Standard_NC6 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC6 = fromString("Standard_NC6");

    /** Static value Standard_NC6s_v2 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC6S_V2 = fromString("Standard_NC6s_v2");

    /** Static value Standard_NC6s_v3 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NC6S_V3 = fromString("Standard_NC6s_v3");

    /** Static value Standard_ND12s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_ND12S = fromString("Standard_ND12s");

    /** Static value Standard_ND24rs for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_ND24RS = fromString("Standard_ND24rs");

    /** Static value Standard_ND24s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_ND24S = fromString("Standard_ND24s");

    /** Static value Standard_ND6s for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_ND6S = fromString("Standard_ND6s");

    /** Static value Standard_NV12 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NV12 = fromString("Standard_NV12");

    /** Static value Standard_NV24 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NV24 = fromString("Standard_NV24");

    /** Static value Standard_NV6 for ContainerServiceVMSizeTypes. */
    public static final ContainerServiceVMSizeTypes STANDARD_NV6 = fromString("Standard_NV6");

    /**
     * Creates a new instance of ContainerServiceVMSizeTypes value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ContainerServiceVMSizeTypes() {
    }

    /**
     * Creates or finds a ContainerServiceVMSizeTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContainerServiceVMSizeTypes.
     */
    public static ContainerServiceVMSizeTypes fromString(String name) {
        return fromString(name, ContainerServiceVMSizeTypes.class);
    }

    /**
     * Gets known ContainerServiceVMSizeTypes values.
     *
     * @return known ContainerServiceVMSizeTypes values.
     */
    public static Collection<ContainerServiceVMSizeTypes> values() {
        return values(ContainerServiceVMSizeTypes.class);
    }
}
