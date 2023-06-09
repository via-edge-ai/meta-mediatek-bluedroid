SUMMARY = "MediaTek Bluetooth RF Certification Tool"
LICENSE = "CLOSED"

inherit autotools-brokensep

SRC_URI = "${AIOT_NDA_URI}/neptune/bt_others/boots.git;protocol=ssh;branch=main;"
SRCREV = "4f77561616629925d3a43b8bea6d66a6e8dafee9"


S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"
INSANE_SKIP_${PN} = "ldflags"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 boots ${D}${bindir}
    install -m 0755 boots_srv ${D}${bindir}
}