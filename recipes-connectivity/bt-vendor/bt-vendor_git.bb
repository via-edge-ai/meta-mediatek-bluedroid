SUMMARY = "MediaTek Bluetooth Vendor Lib"
LICENSE = "CLOSED"

inherit autotools-brokensep

SRC_URI = "${AIOT_NDA_URI}/neptune/bt_others/vendor_lib.git;protocol=ssh;branch=main;"
SRCREV = "3eefc3652f1309b652fc12bbc1a18230f52af227"


S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}"
FILES_${PN}-dev = ""
TARGET_CC_ARCH += "${LDFLAGS}"
INSANE_SKIP_${PN} += "ldflags"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

RPROVIDES:${PN} += " \
	bt-vendor \
"

do_install() {
    install -d ${D}${libdir}
    install -m 755 libbt-vendor.so ${D}${libdir}/
}