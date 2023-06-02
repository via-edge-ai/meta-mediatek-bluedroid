SUMMARY = "MediaTek Bluetooth Firmware Debug Tool"
LICENSE = "CLOSED"

inherit autotools-brokensep

SRC_URI = "${AIOT_NDA_URI}/neptune/bt_others/picus.git;protocol=ssh;branch=main;"
SRCREV = "9d4a3595c36f57bb5bc855ec8f2f372530cb7107"


S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"
INSANE_SKIP_${PN} = "ldflags"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 picus ${D}${bindir}
}