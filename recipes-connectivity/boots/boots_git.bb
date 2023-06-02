SUMMARY = "MediaTek Bluetooth RF Certification Tool"
LICENSE = "CLOSED"

inherit autotools-brokensep

SRC_URI = "${AIOT_NDA_URI}/neptune/bt_others/boots.git;protocol=ssh;branch=main;"
SRCREV = "369ddc1bae3d4d731356aaa959f51fa485cebce5"


S = "${WORKDIR}/git"

TARGET_CC_ARCH += "${LDFLAGS}"
INSANE_SKIP_${PN} = "ldflags"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 boots ${D}${bindir}
    install -m 0755 boots_srv ${D}${bindir}
}