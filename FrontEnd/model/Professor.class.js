"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
var Person_class_1 = require("./Person.class");
var Professor = /** @class */ (function (_super) {
    __extends(Professor, _super);
    function Professor(dni, name, surname, birthday, telephone, adress) {
        var _this = _super.call(this, dni, name, surname, birthday, telephone, adress) || this;
        _this.availability = [];
        return _this;
    }
    Professor.prototype.addAvailability = function (trimester, dayRange, unavailability) {
        this.availability.push(new TrimAvailability(trimester, dayRange, unavailability));
    };
    return Professor;
}(Person_class_1.Person));
exports.Professor = Professor;
