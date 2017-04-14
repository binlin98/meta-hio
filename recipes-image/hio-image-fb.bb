DESCRIPTION = "A core framebuffer image with Qt5.5.1 and demos."
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += " ssh-server-openssh package-management "

DISTRO_FEATURES_append = " opengl alsa eg ttf-fonts pulseaudio "
DISTRO_FEATURES_remove = " x11 wayland directfb"

IMAGE_INSTALL += "\
	packagegroup-core-boot \
	packagegroup-core-full-cmdline \
	openssh-sftp \
	openssh-sftp-server \
	kernel-modules \
	usbutils \
	packagegroup-fonts-trutype-core \
	ttf-ubuntu-mono \
	ttf-ubuntu-sans \
	hdparm
	packagegroup-fsl-tools-benchmark \
	packagegroup-fsl-gstreamer \
	packagegroup-fsl-tools-testapps \
	packagegroup-fsl-tools-gpu \
	gst-fsl-plugin \
	alsa-lib \
	alsa-tools \
	alsa-state \
	alsa-utils \
	alsa-utils-scripts \
	imx-alsa-plugins \
	RDEPENDS_${PN} = " \
	qtbase \
	qtbase-plugins \
	qtbase-tools \
	qtmultimedia \
	qtmultimedia-plugins \
	qtmultimedia-qmlplugins \
	qtsvg \
	qtsvg-plugins \
	qtsensors \
	qtsystems \
	qtsystems-tools \
	qtsystems-qmlplugins \
	qtscript \
	qtgraphicaleffects-qmlplugins \
	qtconnectivity-qmlplugins \
	qtlocation-plugins \
	qtlocation-qmlplugins \
	qtdeclarative \
	qtdeclarative-qmlplugins \
	qtdeclarative-plugins \
	qtwebengine \
	qtwebengine-qmlplugins \
	qtwebengine-plugins \
	${QTWEBKIT} \
	cinematicexperience \
	i2c-tools \
	gcc g++ binutils libgcc libgcc-dev libstdc++ libstdc++-dev libstdc++-staticdev \
	automake ccache chkconfig glib-networking glibmm \
	packagegroup-core-buildessential pkgconfig  \
	fio \
	dhcp-client \
	bluez-hcidump \
	python-dbus python-pygobject \
	tslib \
	tslib-conf \
	tslib-tests \
	tslib-calibrate \
	boost cmake zlib glib-2.0 git \
	firmware-imx-vpu-imx6d \
	firmware-imx-vpu-imx6q \
	wpa-supplicant \
	wireless-tools \
	ruby \
	cpufrequtils \
	nano \
	gdb \
	tar \
	imx-vpu \
	imx-test \
"

QTWEBKIT ??= "\
	qtquick1 \
	qtquick1-qmlplugins \
	qtquick1-plugins \
	qtwebkit \
	qtwebkit-qmlplugins \
"


