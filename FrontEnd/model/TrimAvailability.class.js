"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var TrimAvailability = /** @class */ (function () {
    function TrimAvailability(trimester, dayRangeAvailability, unavailability) {
        this.trimester = trimester;
        this.dayRangeAvailability = dayRangeAvailability;
        this.unavailability = unavailability;
    }
    return TrimAvailability;
}());
exports.TrimAvailability = TrimAvailability;
var dayRange;
(function (dayRange) {
    dayRange[dayRange["morning"] = 1] = "morning";
    dayRange[dayRange["afternoon"] = 2] = "afternoon";
    dayRange[dayRange["allDay"] = 3] = "allDay";
})(dayRange || (dayRange = {}));
