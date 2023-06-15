SUMMARY = "MediaTek Bluetooth Firmware Debug Tool"
LICENSE = "CLOSED"

inherit autotools-brokensep

SRC_URI = "${AIOT_NDA_URI}/neptune/bt_others/picus.git;protocol=ssh;branch=main;"
SRCREV = "28f8a5ac2819557ec67b3053b249030b613d0a11"


S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"
INSANE_SKIP_${PN} = "ldflags"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 picus ${D}${bindir}
}
