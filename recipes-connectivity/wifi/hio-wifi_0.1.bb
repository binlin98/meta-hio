
DESCRIPTION = "Simple helloworld application"
SECTION = "hio-wifi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

SRC_URI = "file://cfg80211.ko         \
           file://wlan0_up.sh         \
           file://wlan.ko             \
           file://wpa_supplicant.conf \
	   file://rtl8188eufw.bin "

S = "${WORKDIR}"

INSANE_SKIP_${PN} = "installed-vs-shipped"
FILES_${PN} += " /usr/share/wifi"

do_install() {
             echo "------------------------"
	     echo "------------------------"

	    #wifi
	    install -d ${D}/usr/share/wifi/
	    install -d ${D}/lib/firmware/rtlwifi
            install -m 0644 ${WORKDIR}/*.ko ${D}/usr/share/wifi/

            install -m 0777 ${WORKDIR}/wlan0_up.sh ${D}/usr/share/wifi/	    
            install -m 0777 ${WORKDIR}/wpa_supplicant.conf ${D}/usr/share/wifi/
	    install -m 0755 ${WORKDIR}/rtl8188eufw.bin ${D}/lib/firmware/rtlwifi 
}
