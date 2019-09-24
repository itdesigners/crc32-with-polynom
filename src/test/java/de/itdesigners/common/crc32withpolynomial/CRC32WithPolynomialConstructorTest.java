/*
 * Copyright (c) 2014, 	 and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package de.itdesigners.common.crc32withpolynomial;

import org.junit.Test;

/**
 * Test for the internal CRC table of the class {@link CRC32WithPolynomial}
 */
public class CRC32WithPolynomialConstructorTest {
	private static final int REFLECTED_POLYNOMIAL = 0xc8df352f;
	private static final long[] CRC_TABLE = new long[] { 0x00000000, 0x30850FF5, 0x610A1FEA, 0x518F101F, 0xC2143FD4,
			0xF2913021, 0xA31E203E, 0x939B2FCB, 0x159615F7, 0x25131A02, 0x749C0A1D, 0x441905E8, 0xD7822A23, 0xE70725D6,
			0xB68835C9, 0x860D3A3C, 0x2B2C2BEE, 0x1BA9241B, 0x4A263404, 0x7AA33BF1, 0xE938143A, 0xD9BD1BCF, 0x88320BD0,
			0xB8B70425, 0x3EBA3E19, 0x0E3F31EC, 0x5FB021F3, 0x6F352E06, 0xFCAE01CD, 0xCC2B0E38, 0x9DA41E27, 0xAD2111D2,
			0x565857DC, 0x66DD5829, 0x37524836, 0x07D747C3, 0x944C6808, 0xA4C967FD, 0xF54677E2, 0xC5C37817, 0x43CE422B,
			0x734B4DDE, 0x22C45DC1, 0x12415234, 0x81DA7DFF, 0xB15F720A, 0xE0D06215, 0xD0556DE0, 0x7D747C32, 0x4DF173C7,
			0x1C7E63D8, 0x2CFB6C2D, 0xBF6043E6, 0x8FE54C13, 0xDE6A5C0C, 0xEEEF53F9, 0x68E269C5, 0x58676630, 0x09E8762F,
			0x396D79DA, 0xAAF65611, 0x9A7359E4, 0xCBFC49FB, 0xFB79460E, 0xACB0AFB8, 0x9C35A04D, 0xCDBAB052, 0xFD3FBFA7,
			0x6EA4906C, 0x5E219F99, 0x0FAE8F86, 0x3F2B8073, 0xB926BA4F, 0x89A3B5BA, 0xD82CA5A5, 0xE8A9AA50, 0x7B32859B,
			0x4BB78A6E, 0x1A389A71, 0x2ABD9584, 0x879C8456, 0xB7198BA3, 0xE6969BBC, 0xD6139449, 0x4588BB82, 0x750DB477,
			0x2482A468, 0x1407AB9D, 0x920A91A1, 0xA28F9E54, 0xF3008E4B, 0xC38581BE, 0x501EAE75, 0x609BA180, 0x3114B19F,
			0x0191BE6A, 0xFAE8F864, 0xCA6DF791, 0x9BE2E78E, 0xAB67E87B, 0x38FCC7B0, 0x0879C845, 0x59F6D85A, 0x6973D7AF,
			0xEF7EED93, 0xDFFBE266, 0x8E74F279, 0xBEF1FD8C, 0x2D6AD247, 0x1DEFDDB2, 0x4C60CDAD, 0x7CE5C258, 0xD1C4D38A,
			0xE141DC7F, 0xB0CECC60, 0x804BC395, 0x13D0EC5E, 0x2355E3AB, 0x72DAF3B4, 0x425FFC41, 0xC452C67D, 0xF4D7C988,
			0xA558D997, 0x95DDD662, 0x0646F9A9, 0x36C3F65C, 0x674CE643, 0x57C9E9B6, 0xC8DF352F, 0xF85A3ADA, 0xA9D52AC5,
			0x99502530, 0x0ACB0AFB, 0x3A4E050E, 0x6BC11511, 0x5B441AE4, 0xDD4920D8, 0xEDCC2F2D, 0xBC433F32, 0x8CC630C7,
			0x1F5D1F0C, 0x2FD810F9, 0x7E5700E6, 0x4ED20F13, 0xE3F31EC1, 0xD3761134, 0x82F9012B, 0xB27C0EDE, 0x21E72115,
			0x11622EE0, 0x40ED3EFF, 0x7068310A, 0xF6650B36, 0xC6E004C3, 0x976F14DC, 0xA7EA1B29, 0x347134E2, 0x04F43B17,
			0x557B2B08, 0x65FE24FD, 0x9E8762F3, 0xAE026D06, 0xFF8D7D19, 0xCF0872EC, 0x5C935D27, 0x6C1652D2, 0x3D9942CD,
			0x0D1C4D38, 0x8B117704, 0xBB9478F1, 0xEA1B68EE, 0xDA9E671B, 0x490548D0, 0x79804725, 0x280F573A, 0x188A58CF,
			0xB5AB491D, 0x852E46E8, 0xD4A156F7, 0xE4245902, 0x77BF76C9, 0x473A793C, 0x16B56923, 0x263066D6, 0xA03D5CEA,
			0x90B8531F, 0xC1374300, 0xF1B24CF5, 0x6229633E, 0x52AC6CCB, 0x03237CD4, 0x33A67321, 0x646F9A97, 0x54EA9562,
			0x0565857D, 0x35E08A88, 0xA67BA543, 0x96FEAAB6, 0xC771BAA9, 0xF7F4B55C, 0x71F98F60, 0x417C8095, 0x10F3908A,
			0x20769F7F, 0xB3EDB0B4, 0x8368BF41, 0xD2E7AF5E, 0xE262A0AB, 0x4F43B179, 0x7FC6BE8C, 0x2E49AE93, 0x1ECCA166,
			0x8D578EAD, 0xBDD28158, 0xEC5D9147, 0xDCD89EB2, 0x5AD5A48E, 0x6A50AB7B, 0x3BDFBB64, 0x0B5AB491, 0x98C19B5A,
			0xA84494AF, 0xF9CB84B0, 0xC94E8B45, 0x3237CD4B, 0x02B2C2BE, 0x533DD2A1, 0x63B8DD54, 0xF023F29F, 0xC0A6FD6A,
			0x9129ED75, 0xA1ACE280, 0x27A1D8BC, 0x1724D749, 0x46ABC756, 0x762EC8A3, 0xE5B5E768, 0xD530E89D, 0x84BFF882,
			0xB43AF777, 0x191BE6A5, 0x299EE950, 0x7811F94F, 0x4894F6BA, 0xDB0FD971, 0xEB8AD684, 0xBA05C69B, 0x8A80C96E,
			0x0C8DF352, 0x3C08FCA7, 0x6D87ECB8, 0x5D02E34D, 0xCE99CC86, 0xFE1CC373, 0xAF93D36C, 0x9F16DC99 };

	@Test
	public void compareCrcTable() {
		final CRC32WithPolynomial crc = new CRC32WithPolynomial(REFLECTED_POLYNOMIAL);
		for (int i = 0; i < CRC_TABLE.length; i++) {
			assert crc.crcTable[i] == CRC_TABLE[i];
		}
	}
}