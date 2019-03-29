/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

jQuery(document).ready(function () {
                                    jQuery('#rev_slider_2_1').show().revolution(
                                            {
                                                dottedOverlay: "none",
                                                delay: 6000,
                                                startwidth: 960,
                                                startheight: 350,
                                                hideThumbs: 200,

                                                thumbWidth: 100,
                                                thumbHeight: 50,
                                                thumbAmount: 4,

                                                navigationType: "none",
                                                navigationArrows: "solo",
                                                navigationStyle: "round",

                                                touchenabled: "on",
                                                onHoverStop: "on",

                                                swipe_velocity: 0.7,
                                                swipe_min_touches: 1,
                                                swipe_max_touches: 1,
                                                drag_block_vertical: false,

                                                keyboardNavigation: "off",

                                                navigationHAlign: "center",
                                                navigationVAlign: "bottom",
                                                navigationHOffset: 0,
                                                navigationVOffset: 20,

                                                soloArrowLeftHalign: "left",
                                                soloArrowLeftValign: "center",
                                                soloArrowLeftHOffset: 20,
                                                soloArrowLeftVOffset: 0,

                                                soloArrowRightHalign: "right",
                                                soloArrowRightValign: "center",
                                                soloArrowRightHOffset: 20,
                                                soloArrowRightVOffset: 0,

                                                shadow: 0,
                                                fullWidth: "off",
                                                fullScreen: "on",

                                                spinner: "spinner0",

                                                stopLoop: "off",
                                                stopAfterLoops: -1,
                                                stopAtSlide: -1,

                                                shuffle: "off",

                                                forceFullWidth: "off",
                                                fullScreenAlignForce: "off",
                                                minFullScreenHeight: "",
                                                hideTimerBar: "on",
                                                hideThumbsOnMobile: "off",
                                                hideNavDelayOnMobile: 1500,
                                                hideBulletsOnMobile: "off",
                                                hideArrowsOnMobile: "off",
                                                hideThumbsUnderResolution: 0,

                                                fullScreenOffsetContainer: "",
                                                fullScreenOffset: "",
                                                hideSliderAtLimit: 0,
                                                hideCaptionAtLimit: 0,
                                                hideAllCaptionAtLilmit: 0,
                                                startWithSlide: 0
                                            });
                                });	/*ready*/

